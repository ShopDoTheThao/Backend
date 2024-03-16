package ctu.edu.vn.backend.service.impl;

import ctu.edu.vn.backend.dto.DiscountDto;
import ctu.edu.vn.backend.entity.Discount;
import ctu.edu.vn.backend.error.entityException.DiscountException;
import ctu.edu.vn.backend.repository.DiscountRepository;
import ctu.edu.vn.backend.service.DiscountService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DiscountServiceImpl implements DiscountService {

    private final DiscountRepository discountRepository;

    @Override
    public Discount save(DiscountDto dto) {
        Discount discount = new Discount();
        BeanUtils.copyProperties(dto, discount);
        return this.discountRepository.save(discount);
    }

    @Override
    public List<Discount> findAll() {
        var discountList = this.discountRepository.findAll();
        if(discountList.isEmpty()){
            throw new DiscountException("List Discount is empty");
        }
        return discountList;
    }

    @Override
    public Page<Discount> findAll(Pageable pageable) {
        return this.findAll(pageable);
    }

    @Override
    public Optional<Discount> findById(Long id) {
        Optional<Discount> existed = Optional.ofNullable(this.discountRepository.findById(id)
                .orElseThrow(() -> new DiscountException("Khong tim thay discount voi id %d".formatted(id))));
        return existed;
    }

    @Override
    public void deleteById(Long id) {
        this.discountRepository.deleteById(id);
    }

    @Override
    public Discount update(Long id, Discount entity) {
        return null;
    }
}
