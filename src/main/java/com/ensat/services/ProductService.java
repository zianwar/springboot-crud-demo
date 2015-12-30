package com.ensat.services;


import com.ensat.domain.Product;

public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);
}
