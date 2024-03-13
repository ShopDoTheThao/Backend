package ctu.edu.vn.backend.service;

import ctu.edu.vn.backend.dto.BrandDto;
import ctu.edu.vn.backend.entity.Brand;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface BrandService {
    public List<Brand> findBrandByName(String name);

    public Brand BrandSave(BrandDto brandDto);

    public List<Brand> findAll();

    public Page<Brand> findAll(Pageable pageable);

    public Optional<Brand> findById(Long id);

    public void deleteById(Long id);

    public Brand updateBrand(Long id, Brand entity);
}
