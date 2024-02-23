package ctu.edu.vn.backend.repository;

import ctu.edu.vn.backend.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepository extends JpaRepository<Discount, Long> {
}