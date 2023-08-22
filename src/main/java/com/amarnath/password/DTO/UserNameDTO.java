package com.amarnath.password.DTO;

import com.amarnath.password.entity.Password;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserNameDTO {

    private int id;

    @Email(message = "Please enter valid email id")
    private String userNameMaster;

    @Pattern(regexp = "(?=.*[0-9])"
            +"(?=.*[a-z])(?=.*[A-Z])"
            +"(?=.*[@#$%^&+=])"
            +"(?=\\S+$).{8,20}",
            message = "Please enter password with number,special character,uppercase and lowercase letter")
    private String masterPassword;

    private List<Password> passwords = new ArrayList<>();
}
