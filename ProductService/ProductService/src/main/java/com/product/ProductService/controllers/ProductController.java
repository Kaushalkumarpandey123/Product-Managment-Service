package com.product.ProductService.controllers;

import com.product.ProductService.dtos.ProductDto;
import com.product.ProductService.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/test")
    public String productTesting() {
        return "Product Testing";
    }

    @GetMapping()
    public List<ProductDto> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping()
    public ProductDto addProduct(@RequestBody ProductDto productDto) {
        return productService.addProduct(productDto);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }

    @GetMapping("/{id}")
    public ProductDto getProduct(@PathVariable int id) {
        return productService.getProduct(id);
    }

    @PutMapping()
    public ProductDto updateProduct(@RequestBody ProductDto productDto) {
        return productService.updateProduct(productDto);
    }

}
