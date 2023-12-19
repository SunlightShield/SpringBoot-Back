package com.backend.cartapp.backendcartapp.repositories;
import com.backend.cartapp.backendcartapp.models.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository <Product, Long>{ 
// long es el tipo de la llave primaria


}
