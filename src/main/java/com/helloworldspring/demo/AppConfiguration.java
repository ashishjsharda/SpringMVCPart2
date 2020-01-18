package com.helloworldspring.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ashis
 *
 */
@RestController
public class AppConfiguration {

	@RequestMapping("/hello")
	public String hello()
	{
		return "Hello World";
	}
}
