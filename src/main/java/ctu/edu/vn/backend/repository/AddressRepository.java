package ctu.edu.vn.backend.repository;

import ctu.edu.vn.backend.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}