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
    List<Brand> findBrandByName(String name);

    Brand BrandSave(BrandDto dto);

    List<Brand> findAll();

    Page<Brand> findAll(Pageable pageable);

    Optional<Brand> findById(Long id);

    void deleteById(Long id);

    Brand updateBrand(Long id, Brand entity);
}
