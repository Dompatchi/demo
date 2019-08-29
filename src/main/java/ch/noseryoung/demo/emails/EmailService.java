package ch.noseryoung.demo.emails;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService{
	
	public JavaMailSender javaMailSender;
	
	@Autowired
	public EmailService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	@Override
	public void sendMessage(Email email) {
		SimpleMailMessage message = new SimpleMailMessage(); 
        message.setTo(email.getTo()); 
        message.setSubject(email.getSubject()); 
        message.setText(email.getText());
        javaMailSender.send(message);
	}

	@Override
	public void sendMessageWithAttachment(Email email) {
		MimeMessage message = javaMailSender.createMimeMessage();
	      
	    MimeMessageHelper helper;
		try {
			helper = new MimeMessageHelper(message, true);
		    helper.setTo(email.getTo());
		    helper.setSubject(email.getSubject());
		    helper.setText(email.getText());
		    
		    for(String s : email.getAttachments()) {
		    	FileSystemResource file 
			      = new FileSystemResource(new File(s));
			    helper.addAttachment(file.getFilename(), file);
		    }
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	    javaMailSender.send(message);
	}
}
