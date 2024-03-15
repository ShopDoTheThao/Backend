package ctu.edu.vn.backend.controller;

import ctu.edu.vn.backend.dto.AddressDto;
import ctu.edu.vn.backend.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/addresses")
@AllArgsConstructor
public class AddressController {
    private final AddressService addressService;
    @GetMapping
    public ResponseEntity<?> search(Pageable pageable) {
        return new ResponseEntity<>(addressService.search(pageable), HttpStatus.OK);
    }
    @GetMapping("{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return new ResponseEntity<>(addressService.findById(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<?> create(AddressDto addressDto) {
        return new ResponseEntity<>(addressService.create(addressDto), HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> update(@PathVariable Long id, AddressDto addressDto) {
        addressService.update(id, addressDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        addressService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
