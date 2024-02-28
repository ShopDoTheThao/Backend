package ctu.edu.vn.backend.dto;

import lombok.Data;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link ctu.edu.vn.backend.entity.City}
 */
@Data
public class CityDto implements Serializable {
    Long id;
    String name;
}