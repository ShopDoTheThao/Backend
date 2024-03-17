package ctu.edu.vn.backend.dto;

import lombok.Data;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link ctu.edu.vn.backend.entity.ShoppingCart}
 */
@Data
public class ShoppingCartDto implements Serializable {
    Long id;
    Double totalItems;
    Double totalPrice;
}