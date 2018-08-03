package br.com.fiap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("contato")
public class ContatoController {

	//Metodo que abre a pagina cadastrar
	@RequestMapping("enviar")
	public String abrirForm() {
		return "contato/form";
	}
	
	//Metodo que processa as informações
	@RequestMapping(value="enviar", method=RequestMethod.POST)
	public String processarForm(String nome, String telefone, String email){
		System.out.println(nome + " " + telefone + " " + email);
		return "contato/form";
	}
	
	//Usa-se o requestMapping e define os metodos(POST,GET) ou @GetMapping / @PostMapping

//	@GetMapping("enviar")
//	public String abrirForm() {
//		return "contato/form";
//	}

//	@PostMapping(value="enviar")
//	public String processarForm(String nome, String telefone, String email){
//		System.out.println(nome + " " + telefone + " " + email);
//		return "contato/form";
//	}
	
}
