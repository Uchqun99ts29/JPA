package com.example.jpa;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
@Getter
@Setter
@Entity


public class Book {
    @Id
    Long id;

    private String name;

    private   Integer size;

}
