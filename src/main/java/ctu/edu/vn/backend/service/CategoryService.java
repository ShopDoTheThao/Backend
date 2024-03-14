package ctu.edu.vn.backend.service;

import ctu.edu.vn.backend.dto.BrandDto;
import ctu.edu.vn.backend.dto.CategoryDto;
import ctu.edu.vn.backend.entity.Brand;
import ctu.edu.vn.backend.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> findCategoryByName(String name);

    Category save(CategoryDto dto);

    List<Category> findAll();

    Page<Category> findAll(Pageable pageable);

    Optional<Category> findById(Long id);

    void deleteById(Long id);

    Category update(Long id, Brand entity);
}
