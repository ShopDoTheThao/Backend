package ctu.edu.vn.backend.repository;

import ctu.edu.vn.backend.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}