package ch.noseryoung.demo.emails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController{
	
	private EmailService emailService;
	
	@Autowired
	public EmailController(EmailService emailService) {
		this.emailService = emailService;
	}

	@PostMapping({"", "/"})
	public void sendSimpleEmail(@RequestBody Email email) {
		emailService.sendMessage(email);
	}
	
	@PostMapping("/attachment")
	public void sendEmailWithAttachment(@RequestBody Email email) {
		emailService.sendMessageWithAttachment(email);
	}

}
