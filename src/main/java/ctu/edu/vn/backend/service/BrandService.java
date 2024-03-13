package ctu.edu.vn.backend.service;

import ctu.edu.vn.backend.dto.BrandDto;
import ctu.edu.vn.backend.entity.Brand;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BrandService {
    public List<Brand> findBrandByName(String name);

    public Brand BrandSave(BrandDto brandDto);
}
