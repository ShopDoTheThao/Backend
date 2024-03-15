package ctu.edu.vn.backend.service;

import ctu.edu.vn.backend.dto.AddressDto;
import ctu.edu.vn.backend.entity.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface AddressService {
    Page<Address> search(Pageable pageable);

    Optional<Address> findById(Long id);

    Address create(AddressDto addressDto);

    void update(Long id, AddressDto addressDto);

    void delete(Long id);
}
