package ctu.edu.vn.backend.controller;

import ctu.edu.vn.backend.dto.CustomerStatusDto;
import ctu.edu.vn.backend.entity.CustomerStatus;
import ctu.edu.vn.backend.repository.CustomerStatusRepository;
import ctu.edu.vn.backend.service.CustomerStatusService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/customer.statuses")
@AllArgsConstructor
public class CustomerStatusController {
    private final CustomerStatusService customerStatusService;
    @GetMapping("{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return new ResponseEntity<>(customerStatusService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CustomerStatusDto customerStatusDto) {
        return new ResponseEntity<>(customerStatusService.create(customerStatusDto),HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody CustomerStatusDto customerStatusDto) {
        customerStatusService.update(id, customerStatusDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        customerStatusService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
