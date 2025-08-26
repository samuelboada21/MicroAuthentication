package co.com.microauth.model.user;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class User {

    private Long userId;
    private String firstName;
    private String lastName;
    private String IdentityDocument;
    private String phone;
    private String address;
    private LocalDate birthDate;
    private BigDecimal salary;
    private String email;
    private String password;
    private Integer roleId;

}
