package ctu.edu.vn.backend.dto;

import ctu.edu.vn.backend.entity.Item;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Item}
 */
@Data
public class ItemDto implements Serializable {
    Long id;
    String name;
    double price;
    int quantity;
    String size;
}