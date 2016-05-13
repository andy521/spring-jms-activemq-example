package producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 消息生产者，以产生订单为例
 * 启动后访问/127.0.0.1:7001 提交订单
 * @author 李恒名
 * @since 2016年3月25日
 */
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
