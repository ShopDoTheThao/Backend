package ctu.edu.vn.backend.service;
import ctu.edu.vn.backend.dto.DiscountDto;
import ctu.edu.vn.backend.entity.Discount;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface DiscountService {
    Discount save(DiscountDto dto);

    List<Discount> findAll();

    Page<Discount> findAll(Pageable pageable);

    Optional<Discount> findById(Long id);

    void deleteById(Long id);

    Discount update(Long id, Discount entity);
}
