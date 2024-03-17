package ctu.edu.vn.backend.service.impl;

import ctu.edu.vn.backend.dto.OrderDto;
import ctu.edu.vn.backend.entity.Brand;
import ctu.edu.vn.backend.entity.Order;
import ctu.edu.vn.backend.error.entityException.OrderException;
import ctu.edu.vn.backend.repository.OrderRepository;
import ctu.edu.vn.backend.service.OrderService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final ModelMapper modelMapper;

    @Override
    public Page<Order> search(Pageable pageable) {
        return orderRepository.findAll(pageable);
    }

    @Override
    public Optional<Order> findById(Long id) {
        return Optional.ofNullable(orderRepository.findById(id)
                .orElseThrow(() -> new OrderException("Khong tim thay order")));
    }

    @Override
    public Order create(OrderDto orderDto) {
        return orderRepository.save(modelMapper.map(orderDto, Order.class));
    }

    @Override
    public void update(Long id, OrderDto orderDto) {
        Optional<Order> order = orderRepository.findById(id);
        order.ifPresent(orderRepository::save);
    }

    @Override
    public void delete(Long id) {
        Optional<Order> order = findById(id);
        order.ifPresent(orderRepository::delete);
    }
}
