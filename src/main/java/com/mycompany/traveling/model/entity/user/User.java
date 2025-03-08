package com.mycompany.traveling.model.entity.user;

import com.mycompany.traveling.model.entity.base.BaseEntity;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User extends BaseEntity {
    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String numberphone;

    @Column(nullable = false)
    private String password;
}
