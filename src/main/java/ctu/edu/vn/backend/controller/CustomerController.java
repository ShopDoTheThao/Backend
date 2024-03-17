package ctu.edu.vn.backend.controller;

import ctu.edu.vn.backend.dto.CustomerDto;
import ctu.edu.vn.backend.entity.Customer;
import ctu.edu.vn.backend.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/customers")
@AllArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("")
    public ResponseEntity<Page<Customer>> search(Pageable pageable) {
        Page<Customer> customers = customerService.search(pageable);
        return new ResponseEntity<>(customers, HttpStatus.OK) ;
    }
    @GetMapping("{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return new ResponseEntity<>(customerService.findById(id),HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody CustomerDto customerDto){
        customerService.create(customerDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody CustomerDto customerDto) {
        customerService.update(id, customerDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        customerService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
