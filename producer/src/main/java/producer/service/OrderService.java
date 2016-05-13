package producer.service;

import model.Order;

/**
 * 类说明
 * @author 李恒名
 * @since 2016年3月25日
 */
public interface OrderService {
	//接受订单
	void accept(Order order);
}
