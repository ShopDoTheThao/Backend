package ctu.edu.vn.backend.repository;

import ctu.edu.vn.backend.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findByNameIgnoreCase(String name);
}