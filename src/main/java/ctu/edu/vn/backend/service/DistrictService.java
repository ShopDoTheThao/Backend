package ctu.edu.vn.backend.service;

import ctu.edu.vn.backend.dto.CityDto;
import ctu.edu.vn.backend.dto.DistrictDto;
import ctu.edu.vn.backend.entity.City;
import ctu.edu.vn.backend.entity.District;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface DistrictService {
    Page<District> search(Pageable pageable);

    Optional<District> findById(Long id);

    District create(DistrictDto districtDto);

    void update(Long id, DistrictDto districtDto);

    void delete(Long id);
}
