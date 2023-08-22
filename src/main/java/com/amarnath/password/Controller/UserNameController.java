package com.amarnath.password.Controller;

import com.amarnath.password.DTO.UserNameDTO;
import com.amarnath.password.Service.UsernameService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserNameController {

    private final UsernameService usernameService;

    public UserNameController(UsernameService usernameService) {
        super();
        this.usernameService = usernameService;
    }

    @PostMapping("/api/v1/users")
    private ResponseEntity<UserNameDTO> createUsers(@Valid @RequestBody UserNameDTO userNameDTO){

        return new ResponseEntity<>(usernameService.createNewUser(userNameDTO), HttpStatus.CREATED);

    }

}
