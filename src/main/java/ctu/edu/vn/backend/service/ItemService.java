package ctu.edu.vn.backend.service;

import ctu.edu.vn.backend.dto.ItemDto;
import ctu.edu.vn.backend.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    List<Item> findCategoryByName(String name);

    Item save(ItemDto dto);

    List<Item> findAll();

    Page<Item> findAll(Pageable pageable);

    Optional<Item> findById(Long id);

    void deleteById(Long id);

    Item update(Long id, Item entity);
}
