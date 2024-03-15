package ctu.edu.vn.backend.controller;

import ctu.edu.vn.backend.dto.OrderDto;
import ctu.edu.vn.backend.dto.OrderStatusDto;
import ctu.edu.vn.backend.entity.OrderStatus;
import ctu.edu.vn.backend.service.OrderService;
import ctu.edu.vn.backend.service.OrderStatusService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/order.statuses")
@AllArgsConstructor
public class OrderStatusController {
    private final OrderStatusService orderStatusService;

    @GetMapping("{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return new ResponseEntity<>(orderStatusService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody OrderStatusDto orderStatusDto) {
        return new ResponseEntity<>(orderStatusService.create(orderStatusDto), HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody OrderStatusDto orderStatusDto) {
        orderStatusService.update(id, orderStatusDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        orderStatusService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
