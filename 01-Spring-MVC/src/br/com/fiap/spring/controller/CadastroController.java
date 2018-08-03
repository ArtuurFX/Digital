package br.com.fiap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.spring.model.Carro;

@Controller
@RequestMapping("cadastro")
public class CadastroController {

	@GetMapping("enviar")
	public String abrirForm() {
		return "cadastro/form";
	}
	
	
	@PostMapping("enviar")
	public ModelAndView processarForm(Carro c) {
		System.out.println(c.getPlaca() + " " + c.getPreco() + " " + c.isAutomatico() + " " + c.getMarca());

		ModelAndView retorno = new ModelAndView("cadastro/form");
		
		retorno.addObject("msg", "Carro Enviado!");
		retorno.addObject("carro", c);
		
		
		return retorno;
	}

	
	
	
}
