package ctu.edu.vn.backend.service;

import ctu.edu.vn.backend.dto.OrderStatusDto;
import ctu.edu.vn.backend.entity.OrderStatus;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface OrderStatusService {
    Optional<OrderStatus> findById(Long id);
    OrderStatus create(OrderStatusDto orderStatusDto);

    void update(Long id, OrderStatusDto orderStatusDto);

    void delete(Long id);
}
