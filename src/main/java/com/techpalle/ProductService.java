package com.techpalle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    private IProductService iProductService;
    public List<Product> getAllProducts(){
        return iProductService.findAll();

    }
    public Product getProductById(Integer Id){
        return iProductService.findById(Id).orElse(null);
    }

    public Product saveProduct(Product product){
        return iProductService.save(product);
    }
    public void deleteProduct(Integer Id){
        iProductService.deleteById(Id);
    }
}
