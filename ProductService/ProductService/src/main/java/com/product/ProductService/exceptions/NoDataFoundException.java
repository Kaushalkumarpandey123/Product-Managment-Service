package com.product.ProductService.exceptions;

import java.util.function.Supplier;

public class NoDataFoundException extends RuntimeException{

    public NoDataFoundException() {
        this("No Data Found.");
    }

    public NoDataFoundException(String message) {
         super(message);
    }
}
