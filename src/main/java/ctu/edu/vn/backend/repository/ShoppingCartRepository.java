package ctu.edu.vn.backend.repository;

import ctu.edu.vn.backend.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {

}