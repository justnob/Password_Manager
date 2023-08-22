package com.amarnath.password.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Password {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String userNameColl;
    private String note;
    private String password;

    @ManyToOne
    @JoinColumn(name = "userName_id")
    private UserName userName;

}
