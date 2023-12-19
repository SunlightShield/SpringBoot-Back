package com.backend.cartapp.backendcartapp.services;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.cartapp.backendcartapp.models.entities.Product;
import com.backend.cartapp.backendcartapp.repositories.ProductRepository;

@Service
public class ProductServicesImpl implements ProductService{

    private ProductRepository repository;

    @Override
    @Transactional (readOnly = true)
    public List<Product> findAll() {

        return (List<Product>) repository.findAll();
    }

}
