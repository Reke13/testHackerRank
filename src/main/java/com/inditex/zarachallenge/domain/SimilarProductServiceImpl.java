package com.inditex.zarachallenge.domain;

import java.time.Instant;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.inditex.zarachallenge.domain.exceptions.NotSimilarProductsFoundException;
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
    List<CustomSimilarProduct> result = this.similarProductRepository.findByProductIdWithOfferDate(productId, date);
    if (CollectionUtils.isEmpty(result))
      throw new NotSimilarProductsFoundException();
    return result;
  }
}
