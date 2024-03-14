package ctu.edu.vn.backend.service.impl;

import ctu.edu.vn.backend.dto.BrandDto;
import ctu.edu.vn.backend.dto.CategoryDto;
import ctu.edu.vn.backend.entity.Brand;
import ctu.edu.vn.backend.entity.Category;
import ctu.edu.vn.backend.error.entityException.CategoryException;
import ctu.edu.vn.backend.repository.CategoryRepository;
import ctu.edu.vn.backend.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {
     private final CategoryRepository categoryRepository;

    @Override
    public List<Category> findCategoryByName(String name) {
        List<Category> listCategory = this.categoryRepository.findByNameIgnoreCase(name);
        if(listCategory.isEmpty()){
            throw new CategoryException("List Category empty");
        }
        return listCategory;
    }

    @Override
    public Category save(CategoryDto dto) {
        Category category = new Category();
        BeanUtils.copyProperties(dto, category);
        this.categoryRepository.save(category);
        return category;
    }

    @Override
    public List<Category> findAll() {
        var categoryList = this.categoryRepository.findAll();
        if(categoryList.isEmpty()){
            throw new CategoryException("List category empty");
        }
        return categoryList;
    }

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return this.categoryRepository.findAll(pageable);
    }

    @Override
    public Optional<Category> findById(Long id) {
        Optional<Category> existed = categoryRepository.findById(id);
        if(existed.isEmpty()){
            throw new CategoryException("Không tìm thấy category với id %d".formatted(id));
        }
        return existed;
    }

    @Override
    public void deleteById(Long id) {
        Optional<Category> categoryOptional = categoryRepository.findById(id);

        categoryOptional.ifPresent(categoryRepository::delete);
    }

    @Override
    public Category update(Long id, Brand entity) {
        return null;
    }

}
