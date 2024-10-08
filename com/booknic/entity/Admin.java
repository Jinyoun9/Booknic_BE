package com.booknic.entity;

import io.jsonwebtoken.Jwt;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Admin implements JwtSubject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aid;
    private String id;
    private String password;
    private String name;
    private String library;
    private String email;
    private String gender;
}
