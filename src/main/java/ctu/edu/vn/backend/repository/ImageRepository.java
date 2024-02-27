package ctu.edu.vn.backend.repository;

import ctu.edu.vn.backend.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}