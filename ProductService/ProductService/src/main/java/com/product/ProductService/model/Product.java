package com.product.ProductService.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "PRODUCT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product implements Serializable {

    @Id
    @Column(name = "PRODUCT_ID", length = 20)
    private int id;

    @Column(name = "PRODUCT_NAME", length = 50)
    private String name;

    @Column(name = "PRODUCT_DESCRIPTION", length = 200)
    private String description;

    @Column(name = "PRODUCT_PRICE", length = 20)
    private BigDecimal price;

}
