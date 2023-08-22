package com.amarnath.password.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class PasswordDTO {

    private int id;

    @Email(message = "Please enter valid email id")
    private String userNameColl;

    private String note;

    @Pattern(regexp = "(?=.*[0-9])"
            +"(?=.*[a-z])(?=.*[A-Z])"
            +"(?=.*[@#$%^&+=])"
            +"(?=\\S+$).{8,20}",
            message = "Please enter password with number,special character,uppercase and lowercase letter")
    private String password;

}
