package ctu.edu.vn.backend.service.impl;

import ctu.edu.vn.backend.dto.CustomerDto;
import ctu.edu.vn.backend.entity.Customer;
import ctu.edu.vn.backend.error.entityException.CustomerException;
import ctu.edu.vn.backend.repository.CustomerRepository;
import ctu.edu.vn.backend.service.CustomerService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;
    @Override
    public Page<Customer> search(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }
    @Override
    public Optional<Customer> findById(long id) {
        return Optional.ofNullable(customerRepository.findById(id)
                .orElseThrow(() -> new CustomerException("Khong tim thay Customer")));
    }
    @Override
    public Customer create(CustomerDto customerDto) {
        return customerRepository.save(modelMapper.map(customerDto, Customer.class));
    }
    @Override
    public void update(Long id, CustomerDto customerDto) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if(customerOptional.isPresent()) {
            Customer customer = modelMapper.map(customerDto, Customer.class);
            customer.setId(id);
            customerRepository.save(customer);
        }
    }
    @Override
    public void delete(long id) {
        Optional<Customer> customerOptional = findById(id);
        customerOptional.ifPresent(customerRepository::delete);
    }
}
