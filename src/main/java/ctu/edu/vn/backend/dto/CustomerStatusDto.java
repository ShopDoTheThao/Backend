package ctu.edu.vn.backend.dto;

import lombok.Data;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link ctu.edu.vn.backend.entity.CustomerStatus}
 */
@Data
public class CustomerStatusDto implements Serializable {
    String name;
    Boolean isActive;
    Boolean isDefault;
}