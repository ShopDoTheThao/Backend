package ctu.edu.vn.backend.service;

import ctu.edu.vn.backend.dto.ShoppingCartDto;
import ctu.edu.vn.backend.entity.ShoppingCart;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ShoppingCartService {
    ShoppingCart save(ShoppingCartDto dto);

    List<ShoppingCart> findAll();

    Page<ShoppingCart> findAll(Pageable pageable);

    Optional<ShoppingCart> findById(Long id);

    void deleteById(Long id);

    ShoppingCart update(Long id, ShoppingCart entity);
}
