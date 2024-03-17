package ctu.edu.vn.backend.service.impl;

import ctu.edu.vn.backend.dto.AddressDto;
import ctu.edu.vn.backend.entity.Address;
import ctu.edu.vn.backend.error.entityException.AddressException;
import ctu.edu.vn.backend.repository.AddressRepository;
import ctu.edu.vn.backend.service.AddressService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;
    private final ModelMapper modelMapper;
    @Override
    public Page<Address> search(Pageable pageable) {
        return addressRepository.findAll(pageable);
    }

    @Override
    public Optional<Address> findById(Long id) {
        return Optional.ofNullable(addressRepository.findById(id)
                .orElseThrow(() -> new AddressException("Dia chi khong ton tai")));
    }

    @Override
    public Address create(AddressDto addressDto) {
        Address address = modelMapper.map(addressDto, Address.class);
        return addressRepository.save(address);
    }

    @Override
    public void update(Long id, AddressDto addressDto) {
        Optional<Address> address = addressRepository.findById(id);
        address.ifPresent(addressRepository::save);
    }

    @Override
    public void delete(Long id) {
        Optional<Address> address = addressRepository.findById(id);
        address.ifPresent(addressRepository::delete);
    }
}
