package ctu.edu.vn.backend.dto;

import lombok.Data;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link ctu.edu.vn.backend.entity.Address}
 */
@Data
public class AddressDto implements Serializable {
    Long id;
    String street;
    String phone;
    Boolean isDefault;
}