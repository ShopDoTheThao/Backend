package ctu.edu.vn.backend.service.impl;

import ctu.edu.vn.backend.dto.CityDto;
import ctu.edu.vn.backend.entity.City;
import ctu.edu.vn.backend.error.entityException.CityException;
import ctu.edu.vn.backend.repository.CityRepository;
import ctu.edu.vn.backend.service.CityService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@AllArgsConstructor
public class CityServiceImpl implements CityService {
    private final CityRepository cityRepository;
    private final ModelMapper modelMapper;
    @Override
    public Page<City> search(Pageable pageable) {
        return cityRepository.findAll(pageable);
    }

    @Override
    public Optional<City> findById(Long id) {
        return Optional.ofNullable(cityRepository.findById(id)
                .orElseThrow(() ->new CityException("Khong tim thay thanh pho")));
    }

    @Override
    public City create(CityDto cityDto) {
        return cityRepository.save(modelMapper.map(cityDto, City.class));
    }

    @Override
    public void update(Long id, CityDto cityDto) {
        Optional<City> city = findById(id);
        city.ifPresent(cityRepository::save);
    }

    @Override
    public void delete(Long id) {
        Optional<City> city = findById(id);
        city.ifPresent(cityRepository::delete);
    }
}
