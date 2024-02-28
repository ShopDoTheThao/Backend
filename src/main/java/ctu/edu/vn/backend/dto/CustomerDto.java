package ctu.edu.vn.backend.dto;

import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link ctu.edu.vn.backend.entity.Customer}
 */
@Data
public class CustomerDto implements Serializable {
    Long id;
    Date registerDate;
}