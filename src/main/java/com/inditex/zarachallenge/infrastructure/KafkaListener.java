package com.inditex.zarachallenge.infrastructure;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.inditex.zarachallenge.infrastructure.entity.SizeEntity;
import com.inditex.zarachallenge.infrastructure.model.ProductAvailabilityEvent;
import com.inditex.zarachallenge.infrastructure.repository.SizeRepository;

@Component
public class KafkaListener {

  private final SizeRepository sizeRepository;

  public KafkaListener(final SizeRepository sizeRepository) {
    this.sizeRepository = sizeRepository;
  }

  @Bean
  public Consumer<Message<ProductAvailabilityEvent>> KafkaConsumer() {
    return message -> {
      ProductAvailabilityEvent contentMessage = message.getPayload();
      SizeEntity entity = this.sizeRepository.findById(contentMessage.getSizeId()).orElseThrow();
      entity.setAvailability(contentMessage.isAvailability());
      entity.setLastUpdated(contentMessage.getUpdate());
      this.sizeRepository.save(entity);
    };
  }

}
