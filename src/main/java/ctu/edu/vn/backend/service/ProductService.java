package ctu.edu.vn.backend.service;

import ctu.edu.vn.backend.dto.CategoryDto;
import ctu.edu.vn.backend.dto.ProductDto;
import ctu.edu.vn.backend.entity.Brand;
import ctu.edu.vn.backend.entity.Category;
import ctu.edu.vn.backend.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProductService {
//    List<Product> findCategoryByName(String name);

    Product save(ProductDto dto);

    List<Product> findAll();

    Page<Product> findAll(Pageable pageable);

    Optional<Product> findById(Long id);

    void deleteById(Long id);

    Product update(Long id, Product entity);
}
