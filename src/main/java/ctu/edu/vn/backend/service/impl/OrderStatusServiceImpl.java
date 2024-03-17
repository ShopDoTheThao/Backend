package ctu.edu.vn.backend.service.impl;

import ctu.edu.vn.backend.dto.OrderStatusDto;
import ctu.edu.vn.backend.entity.OrderStatus;
import ctu.edu.vn.backend.error.entityException.OrderStatusException;
import ctu.edu.vn.backend.repository.OrderStatusRepository;
import ctu.edu.vn.backend.service.OrderStatusService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class OrderStatusServiceImpl implements OrderStatusService {
    private final OrderStatusRepository orderStatusRepository;
    private final ModelMapper modelMapper;

    @Override
    public Optional<OrderStatus> findById(Long id) {
        return Optional.ofNullable(orderStatusRepository.findById(id)
                .orElseThrow(() -> new OrderStatusException("Khong tim thay OrderStatus")));
    }

    @Override
    public OrderStatus create(OrderStatusDto orderStatusDto) {
        return orderStatusRepository.save(modelMapper.map(orderStatusDto, OrderStatus.class));

    }

    @Override
    public void update(Long id, OrderStatusDto orderStatusDto) {
        Optional<OrderStatus> orderStatus = orderStatusRepository.findById(id);
        orderStatus.ifPresent(orderStatusRepository::save);
    }

    @Override
    public void delete(Long id) {
        Optional<OrderStatus> orderStatus = orderStatusRepository.findById(id);
        orderStatus.ifPresent(orderStatusRepository::delete);
    }
}
