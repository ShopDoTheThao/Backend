package ctu.edu.vn.backend.dto;

import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link ctu.edu.vn.backend.entity.Discount}
 */
@Data
public class DiscountDto implements Serializable {
    Long id;
    String name;
    String discription;
    String discountType;
    Double value;
    Date startDate;
    Date endDate;
    Boolean isActive;
    String couponCode;
}