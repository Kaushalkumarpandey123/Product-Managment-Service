package com.product.ProductService.commonUtils;

import com.product.ProductService.dtos.ProductDto;
import com.product.ProductService.models.Product;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductUtil {

    public ProductDto convertToProductDto(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .build();
    }

    public List<ProductDto> convertToProductDto(List<Product> products) {
        return products.stream()
                .map(this::convertToProductDto)
                .collect(Collectors.toList());
    }

    public Product convertToProduct(ProductDto productDto) {
        return Product.builder()
                .id(productDto.getId())
                .name(productDto.getName())
                .description(productDto.getDescription())
                .build();
    }

}
