package org.generation.app.controller;

import java.util.List;

import org.generation.app.entity.Order;
import org.generation.app.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class OrderRestController {
	
	@Autowired
	IOrderService orderService;
	
	@GetMapping("/orders")
	public List<Order> orders() {
		return orderService.findAllOrders();
	}
	
	@GetMapping("/orders/{id}")
	public Order orderId(@PathVariable Long id) {
		return orderService.findOrderById(id);
	}
	

}
