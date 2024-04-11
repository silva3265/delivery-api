package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Vai receber requisições web
public class MeuPrimeiroController {

	@GetMapping("/hello")
	@ResponseBody // o retorno vai ser devolvida como resposta
	public String hello() {
		return "Hello!";
	}

}
