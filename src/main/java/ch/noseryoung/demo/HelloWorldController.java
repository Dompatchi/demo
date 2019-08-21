package ch.noseryoung.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
// Parent mapping
@RequestMapping("/hi")
public class HelloWorldController {
	
	@GetMapping({"", "/"})
	public @ResponseBody ResponseEntity<String> getGreeting() {
		return new ResponseEntity<>("Hello world! <3", HttpStatus.OK);
	}
}
