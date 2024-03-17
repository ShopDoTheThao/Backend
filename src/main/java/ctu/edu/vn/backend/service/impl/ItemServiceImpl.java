package ctu.edu.vn.backend.service.impl;

import ctu.edu.vn.backend.dto.ItemDto;
import ctu.edu.vn.backend.entity.Item;
import ctu.edu.vn.backend.error.entityException.ItemException;
import ctu.edu.vn.backend.repository.ItemRepository;
import ctu.edu.vn.backend.service.ItemService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<Item> findCategoryByName(String name) {
        return null;
    }

    @Override
    public Item save(ItemDto dto) {
        Item item = modelMapper.map(dto, Item.class);
        this.itemRepository.save(item);
        return item;
    }

    @Override
    public List<Item> findAll() {
        var ItemList = this.itemRepository.findAll();
        if(ItemList.isEmpty()){
            throw new ItemException("List Item empty");
        }
        return ItemList;
    }

    @Override
    public Page<Item> findAll(Pageable pageable) {
        return this.itemRepository.findAll(pageable);
    }

    @Override
    public Optional<Item> findById(Long id) {
        Optional<Item> existed = Optional.ofNullable(this.itemRepository.findById(id)
                .orElseThrow(() -> new ItemException("Khong tim thay item voi id %d".formatted(id))));
        return existed;
    }

    @Override
    public void deleteById(Long id) {
        this.itemRepository.deleteById(id);
    }

    @Override
    public Item update(Long id, Item entity) {
        return null;
    }
}
