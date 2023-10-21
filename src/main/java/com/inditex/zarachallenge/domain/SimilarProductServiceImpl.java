package com.inditex.zarachallenge.domain;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.inditex.zarachallenge.infrastructure.model.CustomSimilarProduct;
import com.inditex.zarachallenge.infrastructure.repository.SimilarProductRepository;
import com.inditex.zarachallenge.spi.SimilarProductService;

@Service
public class SimilarProductServiceImpl implements SimilarProductService {

  private final SimilarProductRepository similarProductRepository;

  @Value("${date}")
  private Instant date;

  public SimilarProductServiceImpl(final SimilarProductRepository similarProductRepository) {
    this.similarProductRepository = similarProductRepository;
  }

  @Override
  public List<CustomSimilarProduct> findSimilarProducts(final Integer productId) {
    return this.similarProductRepository
        .findByProductIdWithOfferDate(productId, date);
  }
}
