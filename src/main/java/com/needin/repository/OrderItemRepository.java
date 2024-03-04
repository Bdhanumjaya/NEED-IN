package com.needin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.needin.model.OrderItem;



public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
