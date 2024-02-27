package ctu.edu.vn.backend.dto;

import ctu.edu.vn.backend.entity.Product;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link Product}
 */
@Data
public class ProductDto implements Serializable {
    Long id;
    String name;
    String description;
    Integer quantity;
    Double price;
    String brief;
    String size;
    String color;
    Long viewCount;
    Boolean isFeatured;
    Date createDate;
    Date updateDate;
}