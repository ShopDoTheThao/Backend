package ctu.edu.vn.backend.service.impl;

import ctu.edu.vn.backend.dto.WardDto;
import ctu.edu.vn.backend.entity.Ward;
import ctu.edu.vn.backend.error.entityException.WardException;
import ctu.edu.vn.backend.repository.WardRepository;
import ctu.edu.vn.backend.service.WardService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@AllArgsConstructor
public class WardServiceImpl implements WardService {
    private final WardRepository wardRepository;
    private final ModelMapper modelMapper;
    @Override
    public Page<Ward> search(Pageable pageable) {
        return wardRepository.findAll(pageable);
    }

    @Override
    public Optional<Ward> findById(Long id) {
        return Optional.ofNullable(wardRepository.findById(id)
                .orElseThrow(() ->new WardException("Khong tim thay Ward")));
    }

    @Override
    public Ward create(WardDto wardDto) {
        return wardRepository.save(modelMapper.map(wardDto, Ward.class));
    }

    @Override
    public void update(Long id, WardDto wardDto) {
        Optional<Ward> ward = wardRepository.findById(id);
        ward.ifPresent(wardRepository::save);
    }

    @Override
    public void delete(Long id) {
        Optional<Ward> ward = wardRepository.findById(id);
        ward.ifPresent(wardRepository::delete);
    }
}
