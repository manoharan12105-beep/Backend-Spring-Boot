package me.mano.SpringBootLearning.entity;


import java.time.LocalDateTime;

import org.hibernate.annotations.Check;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Index;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(
  name = "product",
  indexes = {@Index(name = "idx_product_name", columnList = "productName")}
)
@Check(constraints = "product_price > 0 AND length(product_name) > 2 AND length(product_name) < 51")

public class ProductEntity{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long productId;

  @Column(nullable = false)
  private String productName;

  @Lob
  private String productDesc;

  @Column(nullable = false)
  private Double productPrice;

  @Lob
  private byte[] productImage;

  @Enumerated(EnumType.STRING)
  private Category category;

  @CreationTimestamp
  @Column(updatable = false)
  private LocalDateTime createdAt;

  @UpdateTimestamp
  private LocalDateTime updatedAt;

  public  enum Category {
    ELECTRONICS,
    CLOTHING,
    FOOD,
    BOOK,
    OTHER
  }
}
