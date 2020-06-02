package br.usjt.previsoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.previsoes.model.Previsao;
import br.usjt.previsoes.service.PrevisaoService;

@Controller
public class PrevisaoController {
	
	@Autowired
	private PrevisaoService previsaoService;
	
	@GetMapping("/previsao")
	public ModelAndView listarAlunos() {
		ModelAndView mv = new ModelAndView("lista_previsao");
		List<Previsao> previsao = previsaoService.listarTodos();
		mv.addObject("previsao", previsao);
		return mv;
	}
}
