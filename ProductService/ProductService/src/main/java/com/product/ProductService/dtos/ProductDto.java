package com.product.ProductService.dtos;

import lombok.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDto {
    private int id;
    private String name;
    private String description;
    private BigDecimal price;
}
