package com.ensat.services;

import com.ensat.repositories.ProductRepository;
import com.ensat.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> listAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findOne(id);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
