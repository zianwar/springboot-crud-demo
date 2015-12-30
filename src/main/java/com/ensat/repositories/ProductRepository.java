package com.ensat.repositories;

import com.ensat.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}
