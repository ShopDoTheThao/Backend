package ctu.edu.vn.backend.service.impl;

import ctu.edu.vn.backend.dto.BrandDto;
import ctu.edu.vn.backend.entity.Brand;
import ctu.edu.vn.backend.repository.BrandRepository;
import ctu.edu.vn.backend.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


}
