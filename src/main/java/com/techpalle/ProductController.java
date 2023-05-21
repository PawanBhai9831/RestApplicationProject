package com.techpalle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/{Id}")
    public Product getProductById(@PathVariable Integer Id){
        return productService.getProductById(Id);
    }
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
    @PutMapping("/{Id}")
    public Product updateProduct(@PathVariable Integer Id,@RequestBody Product product){
        Product existingProduct=productService.getProductById(Id);
        if(existingProduct==null){
            return null;
        }
        existingProduct.setBatchno(product.getBatchno());
        existingProduct.setPname(product.getPname());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setNoofproduct(product.getNoofproduct());
        return productService.saveProduct(existingProduct);
    }
    @DeleteMapping("/{Id}")
    public void deleteProduct(@PathVariable Integer Id){
        productService.deleteProduct(Id);
    }
}
