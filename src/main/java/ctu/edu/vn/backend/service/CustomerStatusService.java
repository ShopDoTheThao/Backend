package ctu.edu.vn.backend.service;

import ctu.edu.vn.backend.dto.CustomerStatusDto;
import ctu.edu.vn.backend.entity.Customer;
import ctu.edu.vn.backend.entity.CustomerStatus;

import java.util.Optional;

public interface CustomerStatusService {
    Optional<CustomerStatus> findById(Long id);

    CustomerStatus create(CustomerStatusDto customerStatusDto);

    void update(Long id, CustomerStatusDto customerStatusDto);

    void delete(Long id);
}
