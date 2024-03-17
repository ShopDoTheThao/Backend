package ctu.edu.vn.backend.dto;

import ctu.edu.vn.backend.entity.Address;
import ctu.edu.vn.backend.entity.CustomerStatus;
import ctu.edu.vn.backend.entity.Image;
import ctu.edu.vn.backend.entity.ShoppingCart;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * DTO for {@link ctu.edu.vn.backend.entity.Customer}
 */
@Data
public class CustomerDto implements Serializable {
    String firstName;

    String lastName;

    String birthDate;

    String password;

    String phone;

    String email;

    String registerDate;

    Set<Address> addresses = new LinkedHashSet<>();

    CustomerStatus customerStatus;

    String image;

    ShoppingCart shoppingCart;
}