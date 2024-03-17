package ctu.edu.vn.backend.service;

import ctu.edu.vn.backend.dto.OrderDto;
import ctu.edu.vn.backend.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface OrderService {
    Page<Order> search(Pageable pageable);
    Optional<Order> findById(Long id);
    Order create(OrderDto orderDto);
    void update(Long id, OrderDto orderDto);
    void delete(Long id);
}
