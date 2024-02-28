package ctu.edu.vn.backend.repository;

import ctu.edu.vn.backend.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}