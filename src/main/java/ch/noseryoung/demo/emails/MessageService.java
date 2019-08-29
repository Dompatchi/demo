package ch.noseryoung.demo.emails;

public interface MessageService {
	public void sendMessage(Email email);
	
	public void sendMessageWithAttachment(Email email);
}
