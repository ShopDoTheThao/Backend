package ctu.edu.vn.backend.dto;

import lombok.Data;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link ctu.edu.vn.backend.entity.OrderStatus}
 */
@Data
public class OrderStatusDto implements Serializable {
    Long id;
    Boolean isActive;
}