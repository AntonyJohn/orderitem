package com.antony.orderitem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antony.orderitem.dto.OrderItem;
import com.antony.orderitem.repository.OrderItemRepository;

@Service
public class OrderItemServiceImpl implements OrderItemService {

	@Autowired
    private OrderItemRepository orderRepository;
	
	@Override
	public List<OrderItem> createOrder(List<OrderItem> order) {
		// TODO Auto-generated method stub
		return orderRepository.saveAll(order);
	}

	@Override
	public List<OrderItem> getAllOrderList() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public Optional<OrderItem> getOrderDetails(Integer id) {
		// TODO Auto-generated method stub
		return orderRepository.findById(id);
	}

}
