package ctu.edu.vn.backend.controller;

import ctu.edu.vn.backend.dto.ProductDto;
import ctu.edu.vn.backend.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<?> getAllProduct(){
        return new ResponseEntity<>(this.productService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Long id){
        return new ResponseEntity<>(this.productService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProductById(@PathVariable Long id){
        this.productService.deleteById(id);
        return new ResponseEntity<>("Delete product successfuly", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> saveProduct(@RequestBody ProductDto dto){
        return new ResponseEntity<>(this.productService.save(dto), HttpStatus.CREATED);
    }


}
