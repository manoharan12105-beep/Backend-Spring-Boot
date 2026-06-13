package me.mano.SpringBootLearning.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.mano.SpringBootLearning.entity.ProductEntity;
import me.mano.SpringBootLearning.service.ProductService;
import org.springframework.web.bind.annotation.RequestParam;


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
    public ResponseEntity<List<ProductEntity>> getProduct() {
        return ResponseEntity.ok(productService.getProduct1());
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





    //====== Controllers With Exceptions======



    // DuplicateProductException
    @PostMapping("/addProduct")
    public ProductEntity findByName (@RequestBody ProductEntity product) {
        return productService.addToProductlist(product);
    }

    // ProductNotFoundException
    @GetMapping("/getProduct/{id}")
    public Optional<ProductEntity> getMethodName(@PathVariable Long id) {
        return productService.getByProductId(id);
    }

    @GetMapping("/getCategory/{category}")
    public Optional<ProductEntity> getMethodCategory(@PathVariable String category) {
        return productService.getByCategory(category);
    }
}
