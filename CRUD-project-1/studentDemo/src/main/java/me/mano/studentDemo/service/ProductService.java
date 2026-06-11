package me.mano.studentDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.mano.studentDemo.entity.ProductEntity;
import me.mano.studentDemo.repo.ProductRepo;
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

}
