package com.inditex.zarachallenge.spi;

import java.util.List;

import com.inditex.zarachallenge.infrastructure.model.CustomSimilarProduct;

public interface SimilarProductService {
  public List<CustomSimilarProduct> findSimilarProducts(final Integer productId);
}
