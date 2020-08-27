package com.antony.orderitem.service;

import java.util.List;
import java.util.Optional;

import com.antony.orderitem.dto.OrderItem;

/**
 * 
 * @author Antony John
 *
 */
public interface OrderItemService {
	
	public List<OrderItem> createOrder(List<OrderItem> order);
	public List<OrderItem> getAllOrderList();
	public Optional<OrderItem> getOrderDetails(Integer id);

}
