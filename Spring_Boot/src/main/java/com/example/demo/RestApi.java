package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RestApi {
	
	@RequestMapping("/Names")
	public List<country> name()
	{
	   return Arrays.asList(
			   new country("india"),
			   new country("pak")
			   );
	}

}
