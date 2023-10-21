package com.inditex.zarachallenge.infrastructure.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Generated;

@Entity
@Table(name = "SIMILARS_PRODUCT")
@Data
@Generated
public class SimilarProductEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID")
  private int id;
  @Column(name = "PRODUCT_ID")
  private int productId;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "SIMILAR_PRODUCT", referencedColumnName = "id")
  private ProductEntity productEntity;
}