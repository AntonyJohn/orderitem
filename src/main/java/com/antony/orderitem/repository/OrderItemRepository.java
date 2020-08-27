package com.antony.orderitem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.antony.orderitem.dto.OrderItem;


@Repository
@Transactional
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
