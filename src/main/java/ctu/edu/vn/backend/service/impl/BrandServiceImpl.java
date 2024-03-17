package ctu.edu.vn.backend.service.impl;

import ctu.edu.vn.backend.dto.BrandDto;
import ctu.edu.vn.backend.entity.Brand;
import ctu.edu.vn.backend.error.ErrorResponse;
import ctu.edu.vn.backend.error.entityException.BrandException;
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
    public Brand BrandSave(BrandDto dto) {
        Brand entity = new Brand();
        BeanUtils.copyProperties(dto,entity);
        return this.brandRepository.save(entity);
    }

    @Override
    public List<Brand> findAll() {
        List<Brand> listBrand = this.brandRepository.findAll();
        if(listBrand.isEmpty()){
            throw new BrandException("No Brand exists");
        }
        return listBrand;
    }

    @Override
    public Page<Brand> findAll(Pageable pageable) {
        return brandRepository.findAll(pageable);
    }

    @Override
    public Optional<Brand> findById(Long id) {
        Optional<Brand> existed = Optional.ofNullable(this.brandRepository.findById(id)
                .orElseThrow(() -> new BrandException("Brand with id %d could not be found".formatted(id))));
        return existed;
    }


    @Override
    public void deleteById(Long id) {
        Optional<Brand> brandOptional = findById(id);
        brandOptional.ifPresent(brandRepository::delete);
    }

    @Override
    public Brand updateBrand(Long id, Brand entity) {
        return null;
    }


}
