package me.mano.studentDemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.mano.studentDemo.entity.ProductEntity;
import me.mano.studentDemo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ProductEntity createProduct(@RequestBody ProductEntity product) {
       return productService.createProduct1(product);
    }

    @GetMapping("/get")
    public List<ProductEntity> getProduct() {
        return productService.getProduct1();
    }


    @GetMapping("/get/{id}")
    public ProductEntity getProductById(@PathVariable Long id) {
        return productService.getProductById1(id);
    }
   
     @GetMapping("/check/{price}")
    public List<ProductEntity> checkByPrice(@PathVariable Double price) {
        return productService.checkByPrice1(price);
    }

    @PostMapping("/addAll")
    public String createProductAll(@RequestBody List<ProductEntity> product) {
       return productService.createProductAll1(product);
    }

    @PutMapping("/update/{id}")
     public ProductEntity updateById(@PathVariable Long id , @RequestBody ProductEntity product ) {
        return productService.updateById1(id, product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById1(@PathVariable Long id){
        return  productService.deleteById2(id);
     
    }
     
}
