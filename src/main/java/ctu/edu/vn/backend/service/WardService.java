package ctu.edu.vn.backend.service;

import ctu.edu.vn.backend.dto.DistrictDto;
import ctu.edu.vn.backend.dto.WardDto;
import ctu.edu.vn.backend.entity.District;
import ctu.edu.vn.backend.entity.Ward;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface WardService {
    Page<Ward> search(Pageable pageable);

    Optional<Ward> findById(Long id);

    Ward create(WardDto wardDto);

    void update(Long id, WardDto wardDto);

    void delete(Long id);
}
