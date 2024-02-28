package ctu.edu.vn.backend.repository;

import ctu.edu.vn.backend.entity.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerStatusRepository extends JpaRepository<CustomerStatus, Long> {
}