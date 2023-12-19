package com.backend.cartapp.backendcartapp.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue
    private Long Id;

}
