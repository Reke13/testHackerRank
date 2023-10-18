package com.inditex.zarachallenge.infrastructure.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inditex.zarachallenge.infrastructure.entity.OfferEntity;

@Repository
public interface OfferRepository extends CrudRepository<OfferEntity, Integer> {

}
