package ctu.edu.vn.backend.repository;

import ctu.edu.vn.backend.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, Long> {
    public List<Brand> findByNameIgnoreCase(String name);

}