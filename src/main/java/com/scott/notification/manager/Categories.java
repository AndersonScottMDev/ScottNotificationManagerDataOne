package com.scott.notification.manager;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import javax.annotation.processing.Generated;


@Entity
public class Categories {

    @Id
    @Generated(generation.type)
    private Long id;

    private String name;

}
