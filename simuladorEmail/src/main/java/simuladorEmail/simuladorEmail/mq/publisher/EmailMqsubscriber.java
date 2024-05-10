package simuladorEmail.simuladorEmail.mq.publisher;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import simuladorEmail.simuladorEmail.dto.EmailDTO;
import simuladorEmail.simuladorEmail.entity.Email;
import simuladorEmail.simuladorEmail.service.EmailService;


@Component
public class EmailMqsubscriber {

private static final Logger LOG = LoggerFactory.getLogger(EmailMqsubscriber.class);
	
	@Autowired
	private EmailService service;
	
	@RabbitListener(queues = "${mq.queues.email}")
	public void recebendoEmail(@Payload String payload) throws Exception {
		LOG.info("recebendo dados Email!!");
		ObjectMapper mapper = new ObjectMapper();
		//ConsultaDTO dados = mapper.readValue(payload, ConsultaDTO.class);
		EmailDTO dados = mapper.readValue(payload, EmailDTO.class);
		LOG.info("Deu Certo!!");
		service.enviarEmail(dados);
		LOG.info("Email enviado!!!!!");
		LOG.info(dados.toString());
	}
	

	
}
