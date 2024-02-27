package ctu.edu.vn.backend.dto;

import ctu.edu.vn.backend.entity.Image;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Image}
 */
@Data
public class ImageDto implements Serializable {
    Long id;
    String name;
    String fileName;
    String url;
}