package ctu.edu.vn.backend.controller;

import ctu.edu.vn.backend.dto.CityDto;
import ctu.edu.vn.backend.dto.WardDto;
import ctu.edu.vn.backend.service.CityService;
import ctu.edu.vn.backend.service.WardService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/wards")
@AllArgsConstructor
public class WardController {
    private final WardService wardService;

    @GetMapping
    public ResponseEntity<?> search(Pageable pageable) {
        return new ResponseEntity<>(wardService.search(pageable), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return new ResponseEntity<>(wardService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody WardDto wardDto) {
        return new ResponseEntity<>(wardService.create(wardDto), HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody WardDto wardDto) {
        wardService.update(id, wardDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        wardService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
