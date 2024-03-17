package ctu.edu.vn.backend.controller;

import ctu.edu.vn.backend.dto.DiscountDto;
import ctu.edu.vn.backend.service.DiscountService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/api/discounts")
public class DiscountController {
    private final DiscountService discountService;

    @GetMapping
    public ResponseEntity<?> getAllDiscount(){
        return new ResponseEntity<>(this.discountService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Long id){
        return new ResponseEntity<>(this.discountService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProductById(@PathVariable Long id){
        this.discountService.deleteById(id);
        return new ResponseEntity<>("Delete discount successfully", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> saveProduct(@RequestBody DiscountDto dto){
        return new ResponseEntity<>(this.discountService.save(dto), HttpStatus.CREATED);
    }
}
