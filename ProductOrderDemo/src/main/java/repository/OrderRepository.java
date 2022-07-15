package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
  Order findByOrderId(int orderid);
}