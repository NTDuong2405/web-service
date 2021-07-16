package com.example.webservice.service;

import com.example.webservice.entity.Product;
import com.example.webservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@Component(value = "productService")
@WebService
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    @WebMethod
    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> listProducts(){
        return productRepository.findAll();
    }


}

