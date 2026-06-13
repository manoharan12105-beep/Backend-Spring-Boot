package me.mano.SpringBootLearning.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.mano.SpringBootLearning.entity.ProductEntity;
import me.mano.SpringBootLearning.exception.CategoryNotFoundException;
import me.mano.SpringBootLearning.exception.DuplicateProductException;
import me.mano.SpringBootLearning.exception.ProductNotFoundException;
import me.mano.SpringBootLearning.repo.ProductRepo;
@Service
public class ProductService {
  @Autowired
  private ProductRepo productRepo;

  // Post
  public ProductEntity createProduct1(ProductEntity product){
      return productRepo.save(product);
  }
  
  public String createProductAll1(List<ProductEntity> product){
      productRepo.saveAll(product);
      return "saved all";
  }

  // get
  public  List<ProductEntity> getProduct1(){
      return productRepo.findAll();
  }

  public  ProductEntity getProductById1(Long id){
      return productRepo.findById(id).orElseThrow(() -> new RuntimeException("error"));
  }
  
  public  List<ProductEntity> checkByPrice1(Double price){
      List<ProductEntity> allList =  productRepo.findAll() ;
      List<ProductEntity> allList1 = new ArrayList<>();
      
      for (ProductEntity product : allList){
      if(product.getProductPrice() <= price){
          allList1.add(product);
      }
      }
  
      return allList1;
  }

  // update

  public ProductEntity  updateById1(Long id, ProductEntity product){
    ProductEntity p1 = productRepo.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
      p1.setCategory(product.getCategory());
      p1.setProductName(product.getProductName());
      p1.setProductPrice(product.getProductPrice());

      return productRepo.save(p1);
      
  }

    //delete
  public String deleteById2(Long id){
    productRepo.deleteById(id);
    return "deleted successfully";

  }

  

  public ProductEntity addToProductlist(ProductEntity product) {
    if(productRepo.findByProductName(product.getProductName()).isPresent()) {
        throw new DuplicateProductException("Thers is a product with name " + product.getProductName() + " is already exist");
    }

    return productRepo.save(product);
   }

  public Optional<ProductEntity> getByProductId(Long id) {
    return Optional.of(productRepo.findById(id).orElseThrow(() -> new ProductNotFoundException("Product with id " + id + " is not Found...")));
  }

  public Optional<ProductEntity> getByCategory(String category) {
    try {
        ProductEntity.Category cat = ProductEntity.Category.valueOf(category.toUpperCase());
        return Optional.of(productRepo.findByCategory(cat)
                .orElseThrow(() -> new ProductNotFoundException("The Product is not Found")));
    } catch (IllegalArgumentException e) {
        // Convert the default exception into your custom one
        throw new CategoryNotFoundException("Invalid category: " + category);
    }
}
}


