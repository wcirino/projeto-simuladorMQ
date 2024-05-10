package simuladorEmail.simuladorEmail.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MQConfig {

	@Value("${mq.queues.email}")
	private String email;
		
	@Bean
	public Queue queueEmail() {
		return new Queue(email,true);
	}
	
}
