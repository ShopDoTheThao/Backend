package ctu.edu.vn.backend.controller;

import ctu.edu.vn.backend.dto.CityDto;
import ctu.edu.vn.backend.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/cities")
@AllArgsConstructor
public class CityController {
    private final CityService cityService;

    @GetMapping
    public ResponseEntity<?> search(Pageable pageable) {
        return new ResponseEntity<>(cityService.search(pageable), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return new ResponseEntity<>(cityService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CityDto cityDto) {
        return new ResponseEntity<>(cityService.create(cityDto), HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody CityDto cityDto) {
        cityService.update(id, cityDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        cityService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
