package ctu.edu.vn.backend.controller;

import ctu.edu.vn.backend.dto.CityDto;
import ctu.edu.vn.backend.dto.DistrictDto;
import ctu.edu.vn.backend.entity.District;
import ctu.edu.vn.backend.service.CityService;
import ctu.edu.vn.backend.service.DistrictService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/districts")
@AllArgsConstructor
public class DistrictController {
    private final DistrictService districtService;

    @GetMapping
    public ResponseEntity<?> search(Pageable pageable) {
        return new ResponseEntity<>(districtService.search(pageable), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return new ResponseEntity<>(districtService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody DistrictDto districtDto) {
        return new ResponseEntity<>(districtService.create(districtDto), HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody DistrictDto districtDto) {
        districtService.update(id, districtDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        districtService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
