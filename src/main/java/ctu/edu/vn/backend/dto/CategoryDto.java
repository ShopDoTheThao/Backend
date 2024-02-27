package ctu.edu.vn.backend.dto;

import ctu.edu.vn.backend.entity.CategoryStatus;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link ctu.edu.vn.backend.entity.Category}
 */
@Data
public class CategoryDto implements Serializable {
    Long id;
    String name;
    String description;
    Date createDate;
    Date updateDate;
    CategoryStatus status;
}