package com.product.ProductService.dto;

import lombok.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductDto {
    private int id;
    private String name;
    private String description;
    private BigDecimal price;
}
