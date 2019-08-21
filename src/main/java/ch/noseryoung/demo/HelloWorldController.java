package ch.noseryoung.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class HelloWorldController {
	
	@GetMapping("/")
	public @ResponseBody void getGreeting() {
		System.out.println("Hello world! <3");
	}
}
