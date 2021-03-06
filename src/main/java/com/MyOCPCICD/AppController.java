package com.MyOCPCICD;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping(path = "/")
	public String getBasePathResponse() {
		return "You called Base API !!! V2";
	}


	@GetMapping(path = "/sample")
	public String getSampleResponse() {
		return "You Called Sample !!! ";
	}

	@GetMapping(path = "/sample/api")
	public String getSampleAPIResponse() {
		return "You Called Sample API !!! ";
	}

	@GetMapping(path = "/hello")
	public String getHelloPathResponse(@RequestParam String name) {
		return "You Called Query Param API !!! "
				+ "Hello " + name;
	}
	
	@PostMapping(path = "/post/api")
	public String getPostResponse(@RequestBody Request request) {
		return "You called POST API to save id : " + request.getId() + " and Name : " + request.getName();
	}

}

