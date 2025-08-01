package com.deliveryproject.crunchytime.delivery.tracking.domain.repository;

import com.deliveryproject.crunchytime.delivery.tracking.domain.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeliveryRepository
        extends JpaRepository<Delivery, UUID> {

}
