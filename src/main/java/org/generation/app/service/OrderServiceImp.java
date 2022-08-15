package org.generation.app.service;

import java.util.List;

import org.generation.app.entity.Customer;
import org.generation.app.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImp implements IOrderService {
	
	@Autowired
	IOrderService orderRepository;
	
	@Override
	public List<Order> findAllOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAllOrders();
	}

	@Override
	public Order saveOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.saveOrder(order);
	}

	@Override
	public Order deleteOrderById(Long id) {
		Order order = orderRepository.findOrderById(id);
		orderRepository.deleteOrderById(id);
		return order;
	}

	@Override
	public Order findOrderById(Long id) {
		// TODO Auto-generated method stub
		return orderRepository.findOrderById(id);
	}

}
