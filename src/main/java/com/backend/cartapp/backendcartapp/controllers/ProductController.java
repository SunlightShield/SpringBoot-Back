package com.backend.cartapp.backendcartapp.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.backend.cartapp.backendcartapp.models.entities.Product;
import com.backend.cartapp.backendcartapp.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;

//endpoint creado para listar 


@RestController
//@RequestMapping("/api") //ruta primaria
public class ProductController {

    @Autowired
    private ProductService service;
    
    @GetMapping("/products") //ruta secundaria
    
    public List<Product> list() {
        return service.findAll();
    }
}
