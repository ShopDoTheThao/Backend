package ctu.edu.vn.backend.repository;

import ctu.edu.vn.backend.entity.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderStatusRepository extends JpaRepository<OrderStatus, Long> {
}