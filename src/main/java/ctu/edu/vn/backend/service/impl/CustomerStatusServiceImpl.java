package ctu.edu.vn.backend.service.impl;

import ctu.edu.vn.backend.dto.CustomerStatusDto;
import ctu.edu.vn.backend.entity.CustomerStatus;
import ctu.edu.vn.backend.error.entityException.CustomerStatusException;
import ctu.edu.vn.backend.repository.CustomerRepository;
import ctu.edu.vn.backend.repository.CustomerStatusRepository;
import ctu.edu.vn.backend.service.CustomerStatusService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerStatusServiceImpl implements CustomerStatusService {
    private final CustomerStatusRepository customerStatusRepository;
    private final ModelMapper modelMapper;
    private final CustomerRepository customerRepository;

    @Override
    public Optional<CustomerStatus> findById(Long id) {
        return Optional.ofNullable(customerStatusRepository.findById(id)
                .orElseThrow(() -> new CustomerStatusException("Khong tim thay CustomerStatus")));
    }

    @Override
    public CustomerStatus create(CustomerStatusDto customerStatusDto) {
        CustomerStatus customerStatus = modelMapper.map(customerStatusDto, CustomerStatus.class);
        return customerStatusRepository.save(customerStatus);

    }

    @Override
    public void update(Long id, CustomerStatusDto customerStatusDto) {
        Optional<CustomerStatus> optionalCustomerStatus = customerStatusRepository.findById(id);
        if (optionalCustomerStatus.isPresent()) {
            CustomerStatus customerStatus = modelMapper.map(customerStatusDto, CustomerStatus.class);
            customerStatus.setId(id);
            customerStatusRepository.save(customerStatus);
        }
    }

    @Override
    public void delete(Long id) {
        Optional<CustomerStatus> customerStatus = customerStatusRepository.findById(id);
        customerStatus.ifPresent(customerStatusRepository::delete);
    }
}
