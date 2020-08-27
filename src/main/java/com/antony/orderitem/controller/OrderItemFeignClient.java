package com.antony.orderitem.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.antony.orderitem.vo.OrderVO;



@FeignClient(name = "orderitemfeign", url = "http://localhost:8686")
@Component
public interface OrderItemFeignClient {

	@GetMapping("/order/orderdetails/{orderId}")
	public OrderVO getOrderDetails(@PathVariable("orderId") Integer orderId);
}
