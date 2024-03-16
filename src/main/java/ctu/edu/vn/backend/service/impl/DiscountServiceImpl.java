package ctu.edu.vn.backend.service.impl;

import ctu.edu.vn.backend.dto.DiscountDto;
import ctu.edu.vn.backend.entity.Discount;
import ctu.edu.vn.backend.service.DiscountService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public class DiscountServiceImpl implements DiscountService {
    @Override
    public Discount save(DiscountDto dto) {
        return null;
    }

    @Override
    public List<Discount> findAll() {
        return null;
    }

    @Override
    public Page<Discount> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Discount> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Discount update(Long id, Discount entity) {
        return null;
    }
}
