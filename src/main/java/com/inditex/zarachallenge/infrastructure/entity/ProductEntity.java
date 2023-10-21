package com.inditex.zarachallenge.infrastructure.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Generated;

@Entity
@Table(name = "PRODUCT")
@Data
@Generated
public class ProductEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID")
  private int id;
  @Column(name = "NAME")
  private String name;
  @OneToMany(targetEntity = OfferEntity.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name = "PRODUCT_ID")
  private List<OfferEntity> offerEntity;
}