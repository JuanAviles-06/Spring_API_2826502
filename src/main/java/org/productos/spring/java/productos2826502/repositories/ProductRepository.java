package org.productos.spring.java.productos2826502.repositories;

import java.util.List;

import org.productos.spring.java.productos2826502.entities.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    //la lista de un repositorio
    //debe ser inmutable
    //La logica de negocio no modifica 
    //la lista de un repo

    List<Product> productos = List.of(
        Product.builder()
                .id(1L)
                .nombre("Silla Reclinable")
                .precio(345000.0)
                .build()
                ,
        new Product(2L, "Escritorio", 2000000.0)
    );

    //metodo(comportamiento) para consultar todos los productos del repositorio
    public List<Product> findAll(){
        return this.productos;
    }

}
