package ctu.edu.vn.backend.dto;

import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link ctu.edu.vn.backend.entity.Person}
 */
@Data
public class PersonDto implements Serializable {
    Long id;
    String firstName;
    String lastName;
    Date birthDate;
    String password;
    String phone;
    String email;
}