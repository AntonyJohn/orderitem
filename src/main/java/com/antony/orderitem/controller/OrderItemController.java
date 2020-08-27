package com.antony.orderitem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antony.orderitem.dto.OrderItem;
import com.antony.orderitem.service.OrderItemService;

/**
 * 
 * @author Antony John
 *
 */

@RestController
@RequestMapping("/orderitem")
public class OrderItemController {

	@Autowired
    private OrderItemService orderItemService;
	
	@Autowired
	private OrderItemFeignClient orderItemFeignClient;
	
	@PostMapping("/create")
	public List<OrderItem> createOrder(@RequestBody List<OrderItem> order) throws Exception {
		try {
			long count = order.stream().filter(e -> e.getOrderId() != orderItemFeignClient.getOrderDetails(e.getOrderId()).getId()).count();
			/*boolean flag = false;
			for(OrderItem orderIt: order) {
				Integer id =orderItemFeignClient.getOrderDetails(orderIt.getOrderId()).getId();
				if(orderIt.getOrderId() != id) {
					flag = true;
				}
			}*/
			if(count != 0) {
				throw new Exception("Order Not Found");
			}
		} catch(Exception e) {
			throw new Exception("Order Not Found");
		}
		return orderItemService.createOrder(order);
	}
	
	@GetMapping("/getall")
	public List<OrderItem> getAllOrder() {
		return orderItemService.getAllOrderList();
	}
	
	@GetMapping("/orderdetails/{orderId}")
	public Optional<OrderItem> getOrderDetails(@PathVariable("orderId") Integer orderId) {
		return orderItemService.getOrderDetails(orderId);
	}
	
	
}
