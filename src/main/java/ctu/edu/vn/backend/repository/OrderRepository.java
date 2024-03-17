package ctu.edu.vn.backend.repository;

import ctu.edu.vn.backend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}