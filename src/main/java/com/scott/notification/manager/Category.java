package com.scott.notification.manager;


import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;


@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Byte id;

    @Column(name = "name")
    private String name;


    //use the "mappedBy" field to show that the Category field in the Products entity is the owner of the relationship
    @OneToMany(mappedBy = "category")
    private Set<Product> products = new HashSet<>();


}
