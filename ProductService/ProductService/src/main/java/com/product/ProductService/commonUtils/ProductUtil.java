package com.product.ProductService.commonUtils;

import com.product.ProductService.dtos.ProductDto;
import com.product.ProductService.models.Product;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductUtil {

    public ProductDto convertToProductDto(Product product) {
        return new ProductDto(product.getId(), product.getName(), product.getDescription(), product.getPrice());
    }

    public List<ProductDto> convertToProductDto(List<Product> products) {
        return products.stream()
                .map(this::convertToProductDto)
                .collect(Collectors.toList());
    }

    public Product convertToProduct(ProductDto productDto) {
        return new Product(productDto.getId(), productDto.getName(), productDto.getDescription(), productDto.getPrice());
    }

}
