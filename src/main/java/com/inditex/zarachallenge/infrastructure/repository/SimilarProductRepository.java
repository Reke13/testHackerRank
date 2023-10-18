package com.inditex.zarachallenge.infrastructure.repository;

import java.time.Instant;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inditex.zarachallenge.infrastructure.entity.SimilarProductEntity;
import com.inditex.zarachallenge.infrastructure.model.CustomSimilarProduct;

@Repository
public interface SimilarProductRepository extends CrudRepository<SimilarProductEntity, Integer> {

  @Query("SELECT new com.inditex.zarachallenge.infrastructure.model.CustomSimilarProduct(pro.id, pro.name, of.price, si.availability) "
      +
      "FROM SimilarProductEntity sp " +
      "JOIN ProductEntity pro ON (pro.id = sp.productEntity) " +
      "LEFT JOIN OfferEntity of ON (of.productId = pro.id) " +
      "LEFT JOIN SizeEntity si ON (si.productId = pro.id) " +
      "WHERE sp.productId = :productId AND of.validForm < :date " +
      "AND of.validForm = (SELECT max(of2.validForm) from OfferEntity of2 WHERE of2.productId = pro.id AND of2.validForm < :date)")
  public List<CustomSimilarProduct> findByProductIdWithOfferDate(@Param("productId") final Integer productId,
      @Param("date") final Instant date);
}
