package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.OrderItems;

public interface OrderItemsRepository extends JpaRepository<OrderItems, Long> {
	  OrderItems findByOrderItemId(int itemid);
	}