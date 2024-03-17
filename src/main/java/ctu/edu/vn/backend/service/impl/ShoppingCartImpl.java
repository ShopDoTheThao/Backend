package ctu.edu.vn.backend.service.impl;

import ctu.edu.vn.backend.dto.ShoppingCartDto;
import ctu.edu.vn.backend.entity.ShoppingCart;
import ctu.edu.vn.backend.error.entityException.ShoppingCartException;
import ctu.edu.vn.backend.repository.ShoppingCartRepository;
import ctu.edu.vn.backend.service.ShoppingCartService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ShoppingCartImpl implements ShoppingCartService {

    private final ShoppingCartRepository shoppingCartRepository;
    private final ModelMapper modelMapper;
    @Override
    public ShoppingCart save(ShoppingCartDto dto) {
        ShoppingCart shoppingCart = modelMapper.map(dto, ShoppingCart.class);
        this.shoppingCartRepository.save(shoppingCart);
        return shoppingCart;
    }

    @Override
    public List<ShoppingCart> findAll() {
        var listShoppingCart = this.shoppingCartRepository.findAll();
        if(listShoppingCart.isEmpty()){
            throw new ShoppingCartException("List is empty");
        }
        return listShoppingCart;
    }

    @Override
    public Page<ShoppingCart> findAll(Pageable pageable) {
        return this.shoppingCartRepository.findAll(pageable);
    }

    @Override
    public Optional<ShoppingCart> findById(Long id) {
        Optional<ShoppingCart> existed = Optional.ofNullable(this.shoppingCartRepository.findById(id)
                .orElseThrow(() -> new ShoppingCartException("Khong tim thay voi id %d".formatted(id))));
        return existed;
    }

    @Override
    public void deleteById(Long id) {
        this.shoppingCartRepository.deleteById(id);
    }

    @Override
    public ShoppingCart update(Long id, ShoppingCart entity) {
        return null;
    }
}
