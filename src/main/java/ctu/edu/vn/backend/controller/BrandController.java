package ctu.edu.vn.backend.controller;

import ctu.edu.vn.backend.dto.BrandDto;
import ctu.edu.vn.backend.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/brands")
@CrossOrigin
public class BrandController {
    private final BrandService brandService;

    @Autowired
    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @PostMapping
    public ResponseEntity<?> saveBrand(BrandDto dto){
        return new ResponseEntity<>(brandService.BrandSave(dto), HttpStatus.CREATED);
    }
    @GetMapping("/{name}")
    public ResponseEntity<?> getBrandByName(@PathVariable String name){
        return new ResponseEntity<>(brandService.findBrandByName(name), HttpStatus.OK);
    }
}
