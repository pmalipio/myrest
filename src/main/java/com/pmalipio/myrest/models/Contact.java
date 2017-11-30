package com.pmalipio.myrest.models;

import lombok.*;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Contact {

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter @Setter private String name;
    @Getter @Setter private String phone;
    @Getter @Setter private String email;
}
