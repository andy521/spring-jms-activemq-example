package consumer.jms.listeners;

import model.Order;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

/**
 * 订单消息队列监听器
 *
 * @author 李恒名
 * @since 2016年3月28日
 */
@Component
public class OrderListener {
	/**
	 * 监听订单消息队列，消费消息(处理订单)
	 *
	 * @param order the order
	 */
	@JmsListener(destination="orders")
	public void handle(Order order){
		
	    //MessageBuilder.withPayload(new String()).setHeader("", "").build();
		/*if(message instanceof ObjectMessage){
			ObjectMessage objectMessage = (ObjectMessage) message;
			try {
				Order order = (Order)objectMessage.getObject();
				System.out.println("-----------------开始处理订单-----------------");
				if("张三".equals(order.getUserName())){
					throw new RuntimeException("不支持该用户的订单");
				}
				System.out.println("订单编号:"+order.getId());
				System.out.println("下单日期:"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(order.getCreateDate()));
				System.out.println("客户名称:"+order.getUserName());
				System.out.println("订单详情:"+order.getDetail());
				Thread.sleep(3000l);//模拟订单处理需要的时间3秒。
			} catch (InterruptedException |  JMSException e) {
				e.printStackTrace();
			}
			System.out.println("-----------------订单处理完毕-----------------");
		}*/
		
		System.out.println("-----------------开始处理订单-----------------");
		System.out.println("订单编号:"+order.getId());
		System.out.println("下单日期:"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(order.getCreateDate()));
		System.out.println("客户名称:"+order.getUserName());
		System.out.println("订单详情:"+order.getDetail());
		try{
			Thread.sleep(3000l);//模拟订单处理需要的时间3秒。
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			System.out.println("-----------------订单处理完毕-----------------");
	}
}
