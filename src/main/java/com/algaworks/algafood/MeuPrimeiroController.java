package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Controller é um component também
public class MeuPrimeiroController {

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello!";
	}
	
}
