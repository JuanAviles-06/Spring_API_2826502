package org.productos.spring.java.productos2826502.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import jakarta.;

@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name='products')
public class Product {

    private Long id;
    private String nombre;
    private Double precio;

}
