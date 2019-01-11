package com.argo.developer.reactAndSpring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Ruslan on 11.01.2019.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    private String id;
    private String name;
    private String email;
}
