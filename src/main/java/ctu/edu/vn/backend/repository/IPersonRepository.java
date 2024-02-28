package ctu.edu.vn.backend.repository;

import ctu.edu.vn.backend.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonRepository extends JpaRepository<Person, Long> {
}