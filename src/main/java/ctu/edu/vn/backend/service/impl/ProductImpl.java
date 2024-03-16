package ctu.edu.vn.backend.service.impl;

import ctu.edu.vn.backend.dto.ProductDto;
import ctu.edu.vn.backend.entity.Product;
import ctu.edu.vn.backend.error.entityException.ProductException;
import ctu.edu.vn.backend.repository.ProductRepository;
import ctu.edu.vn.backend.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product save(ProductDto dto) {
        Product product = new Product();
        BeanUtils.copyProperties(dto, product);
        this.productRepository.save(product);
        return product;
    }

    @Override
    public List<Product> findAll() {
        List<Product> listProduct = this.productRepository.findAll();
        if(listProduct.isEmpty()){
            throw new ProductException("List Product empty");
        }
        return listProduct;
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        var listProduct = this.productRepository.findAll(pageable);
        if(listProduct.isEmpty()){
            throw new ProductException("List Product empty");
        }
        return listProduct;
    }

    @Override
    public Optional<Product> findById(Long id) {
        Optional<Product> existed = Optional.ofNullable(this.productRepository.findById(id)
                .orElseThrow(() -> new ProductException("Không tìm thấy product voi id %d ".formatted(id))));
        return existed;
    }

    @Override
    public void deleteById(Long id) {
        this.productRepository.deleteById(id);
    }

    @Override
    public Product update(Long id, Product entity) {
        return null;
    }
}
