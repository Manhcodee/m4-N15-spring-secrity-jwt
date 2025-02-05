package com.springsecurityjwt.service.product;

import com.springsecurityjwt.model.Product;
import com.springsecurityjwt.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productRepo.findById(id).orElse(null);
    }

    @Override
    public Product save(Product product) {
        productRepo.save(product);
        return product;
    }

    @Override
    public void delete(Product product) {
        productRepo.delete(product);
    }
}
