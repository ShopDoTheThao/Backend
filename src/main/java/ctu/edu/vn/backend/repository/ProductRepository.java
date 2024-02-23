package ctu.edu.vn.backend.repository;

import ctu.edu.vn.backend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}