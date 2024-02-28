package ctu.edu.vn.backend.dto;

import lombok.Data;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link ctu.edu.vn.backend.entity.Ward}
 */
@Data
public class WardDto implements Serializable {
    Long id;
    String name;
}