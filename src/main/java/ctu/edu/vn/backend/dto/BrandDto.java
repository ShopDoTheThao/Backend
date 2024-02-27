package ctu.edu.vn.backend.dto;

import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link ctu.edu.vn.backend.entity.Brand}
 */
@Data
public class BrandDto implements Serializable {
    Long id;
    String name;
    String description;
    Date foundedYear;
    String countryOfOrigin;
    Boolean isActive;
}