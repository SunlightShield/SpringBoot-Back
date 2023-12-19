package com.backend.cartapp.backendcartapp.services;
import com.backend.cartapp.backendcartapp.models.entities.Product;
import java.util.List;

public interface ProductService {
    List<Product> findAll();
}
