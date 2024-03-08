package ctu.edu.vn.backend.dto;

import lombok.Value;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link ctu.edu.vn.backend.entity.Category}
 */
@Value
public class CategoryDto implements Serializable {
    Long id;
    String name;
    String description;
    Date createDate;
    Date updateDate;
}