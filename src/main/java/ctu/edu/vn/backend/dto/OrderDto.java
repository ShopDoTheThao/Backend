package ctu.edu.vn.backend.dto;

import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link ctu.edu.vn.backend.entity.Order}
 */
@Data
public class OrderDto implements Serializable {
    Long id;
    Integer totalItems;
    Double totalPrice;
    String discount;
    String paymentMethod;
    Date createAt;
    Date updateAt;
}