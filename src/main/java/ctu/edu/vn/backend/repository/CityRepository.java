package ctu.edu.vn.backend.repository;

import ctu.edu.vn.backend.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}