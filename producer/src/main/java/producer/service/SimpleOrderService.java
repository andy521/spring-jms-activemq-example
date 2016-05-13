package producer.service;

import model.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * 类说明
 * @author 李恒名
 * @since 2016年3月25日
 */
@Service
public class SimpleOrderService implements OrderService{
	@Autowired
	private JmsTemplate jmsTemplate;
	public void accept(Order order) {
		//no handle, send to queue.
		jmsTemplate.convertAndSend("orders", order);
	}

}
