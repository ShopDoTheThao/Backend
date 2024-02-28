package ctu.edu.vn.backend.repository;

import ctu.edu.vn.backend.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}