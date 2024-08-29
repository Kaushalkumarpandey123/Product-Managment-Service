package com.product.ProductService.service;

import com.product.ProductService.CommonUtil.ProductUtil;
import com.product.ProductService.dao.ProductDao;
import com.product.ProductService.dto.ProductDto;
import com.product.ProductService.exceptions.NoDataFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductDao productDao;
    private final ProductUtil productUtil;

    @Autowired
    public ProductService(ProductDao productDao, ProductUtil productUtil) {
        this.productDao = productDao;
        this.productUtil = productUtil;
    }

    public List<ProductDto> getAllProducts() {
        return productUtil.convertToProductDto(productDao.findAll());
    }

    public ProductDto addProduct(ProductDto productdto) {
        productDao.save(productUtil.convertToProduct(productdto));
        return productdto;
    }

    public String deleteProduct(int id) {
        if (!productDao.existsById(id)) {
            throw new NoDataFoundException("Product with id " + id + " not found.");
        }
        productDao.deleteById(id);
        return "Product with id " + id + " deleted successfully.";
    }

    public ProductDto getProduct(int id) {
        return productDao.findById(id)
                .map(productUtil::convertToProductDto)
                .orElseThrow(() -> new NoDataFoundException("Product with id " + id + " not found."));
    }

    public ProductDto updateProduct(ProductDto productDto) {
        if (!productDao.existsById(productDto.getId())) {
            throw new NoDataFoundException("Product with id " + productDto.getId() + " not found.");
        }
        return addProduct(productDto);
    }
}
