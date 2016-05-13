package producer.controller;

import model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import producer.service.OrderService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 生产者，订单控制器。
 *
 * @author 李恒名
 * @since 2016年3月25日
 */
@RestController
public class OrderController {
	@Autowired
	private OrderService orderService;

	/**
	 * Add order.
	 *
	 * @param order the order
	 * @return the order
	 */
	@RequestMapping("order/add")
	public Order add(Order order){
		order.setCreateDate(new Date());
		order.setId(UUID.randomUUID().toString());
		orderService.accept(order);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date())+"-->下单成功！");
		return order;
	}
}
