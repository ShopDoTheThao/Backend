package ctu.edu.vn.backend.service;

import ctu.edu.vn.backend.dto.CustomerDto;
import ctu.edu.vn.backend.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CustomerService {
    Page<Customer> search(Pageable pageable);

    Optional<Customer> findById(long id);

    Customer create(CustomerDto customerDto);

    void update(Long id, CustomerDto customerDto);

    void delete(long id);
}
