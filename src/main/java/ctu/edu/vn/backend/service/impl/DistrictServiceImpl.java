package ctu.edu.vn.backend.service.impl;

import ctu.edu.vn.backend.dto.DistrictDto;
import ctu.edu.vn.backend.entity.District;
import ctu.edu.vn.backend.repository.DistrictRepository;
import ctu.edu.vn.backend.service.DistrictService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class DistrictServiceImpl implements DistrictService {
    private final DistrictRepository districtRepository;
    private final ModelMapper modelMapper;
    @Override
    public Page<District> search(Pageable pageable) {
        return districtRepository.findAll(pageable);
    }

    @Override
    public Optional<District> findById(Long id) {
        return Optional.ofNullable(districtRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Khong tim thay District")));
    }

    @Override
    public District create(DistrictDto districtDto) {
        return districtRepository.save(modelMapper.map(districtDto, District.class));
    }

    @Override
    public void update(Long id, DistrictDto districtDto) {
        Optional<District> district = districtRepository.findById(id);
        district.ifPresent(districtRepository::save);
    }

    @Override
    public void delete(Long id) {
        Optional<District> district = districtRepository.findById(id);
        district.ifPresent(districtRepository::delete);
    }
}
