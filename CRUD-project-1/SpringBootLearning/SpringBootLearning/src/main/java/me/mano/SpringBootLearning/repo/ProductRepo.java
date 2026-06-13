package me.mano.SpringBootLearning.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.mano.SpringBootLearning.entity.ProductEntity;
import me.mano.SpringBootLearning.entity.ProductEntity.Category;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Long>{

  Optional<ProductEntity> findByProductName(String productName);

  Optional<ProductEntity> findByCategory(Category cat);
    
}
