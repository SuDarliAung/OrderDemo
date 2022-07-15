package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Order;
import model.OrderItems;
import repository.CustomerRepository;
import repository.OrderItemsRepository;
import repository.OrderRepository;
import repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductOrderController {
	@Autowired
	OrderRepository orderRepository;
	@Autowired
	OrderItemsRepository orderitemRepository;
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	ProductRepository productRepository;
	
	public OrderRepository getOrderRepository() {
		return orderRepository;
	}

	public void setOrderRepository(OrderRepository repository) {
		this.orderRepository = repository;
	}
	
	public OrderItemsRepository getOrderItemsRepository() {
		return orderitemRepository;
	}

	public void setOrderItemsRepository(OrderItemsRepository repository) {
		this.orderitemRepository = repository;
	}
	
	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}

	public void setCustomerRepository(CustomerRepository repository) {
		this.customerRepository = repository;
	}
	
	public ProductRepository getProductRepository() {
		return productRepository;
	}

	public void setProductRepository(ProductRepository repository) {
		this.productRepository = repository;
	}

	@GetMapping(value = "/order")
	public List<Order> getAllOrder() {
		return orderRepository.findAll();
	}

	@PostMapping("/order")
	Order SaveOrder(@RequestBody Order order) {
		return orderRepository.save(order);
	}

	@GetMapping("/order/{id}")
	Order getOrderById(@PathVariable int id) {
		return orderRepository.findByOrderId(id);
	}

	@PutMapping("/order/{id}")
	Order updateOrder(@RequestBody Order newOrder, @PathVariable int id) {
		Order orderData = orderRepository.findByOrderId(id);
		orderData.setOrderno(newOrder.getOrderno());
		orderData.setOrder_date(newOrder.getOrder_date());
		orderData.setStatus(newOrder.getStatus());
		return orderRepository.save(orderData);
	}

	@DeleteMapping("/order/{id}")
	void deleteOrder(@PathVariable Long id) {
		orderRepository.deleteById(id);
	}
	
	@GetMapping(value = "/orderitems")
	public List<OrderItems> getAllOrderItems() {
		return orderitemRepository.findAll();
	}

	@PostMapping("/orderitems")
	OrderItems SaveOrderItems(@RequestBody OrderItems orderitem) {
		return orderitemRepository.save(orderitem);
	}

	@GetMapping("/orderitems/{id}")
	OrderItems getOrderByItemId(@PathVariable int id) {
		return orderitemRepository.findByOrderItemId(id);
	}

	@PutMapping("/orderitems/{id}")
	OrderItems updateOrderItems(@RequestBody OrderItems newOrderItem, @PathVariable int id) {
		OrderItems orderitemData = orderitemRepository.findByOrderItemId(id);
		orderitemData.setQuantity(newOrderItem.getQuantity());
		orderitemData.setTotal(newOrderItem.getTotal());
		return orderitemRepository.save(orderitemData);
	}

	@DeleteMapping("/orderitems/{id}")
	void deleteOrderItems(@PathVariable Long id) {
		orderitemRepository.deleteById(id);
	}
}