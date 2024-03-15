package ctu.edu.vn.backend.service;

import ctu.edu.vn.backend.dto.CityDto;
import ctu.edu.vn.backend.entity.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CityService {
    Page<City> search(Pageable pageable);

    Optional<City> findById(Long id);

    City create(CityDto cityDto);

    void update(Long id, CityDto cityDto);

    void delete(Long id);

}
