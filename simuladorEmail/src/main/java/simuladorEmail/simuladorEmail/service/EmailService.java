package simuladorEmail.simuladorEmail.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import simuladorEmail.simuladorEmail.dto.EmailDTO;
import simuladorEmail.simuladorEmail.entity.Email;
import simuladorEmail.simuladorEmail.repository.EmailRepository;

@Service
public class EmailService {

    private final EmailRepository emailRepository;

    public EmailService(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    public void enviarEmail(EmailDTO emailDTO) {
        Email email = new Email();
        email.setNome(emailDTO.getNome());
        email.setTitulo(emailDTO.getTitulo());
        email.setAssunto(emailDTO.getAssunto());
        email.setCorpo(emailDTO.getCorpo());
        email.setEmailRemetente(emailDTO.getEmailRemetente());
        email.setDataEnvio(new Date()); 
        emailRepository.save(email);
    }
}

