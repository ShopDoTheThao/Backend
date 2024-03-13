package ctu.edu.vn.backend.service.impl;

import ctu.edu.vn.backend.dto.BrandDto;
import ctu.edu.vn.backend.entity.Brand;
import ctu.edu.vn.backend.repository.BrandRepository;
import ctu.edu.vn.backend.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;

    @Autowired
    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> findBrandByName(String name) {
        return brandRepository.findByNameIgnoreCase(name);
    }

    @Override
    public Brand BrandSave(BrandDto brandDto) {
        var entity = new Brand();
        BeanUtils.copyProperties(brandDto, entity);
        return this.brandRepository.save(entity);
    }

    @Override
    public List<Brand> findAll() {
        return null;
    }

    @Override
    public Page<Brand> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Brand> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Brand updateBrand(Long id, Brand entity) {
        return null;
    }


}
