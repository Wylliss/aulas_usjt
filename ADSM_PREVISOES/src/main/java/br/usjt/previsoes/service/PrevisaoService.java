package br.usjt.previsoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.previsoes.model.Previsao;
import br.usjt.previsoes.repository.PrevisaoRepository;

@Service
public class PrevisaoService {
	@Autowired
	private PrevisaoRepository previsaoRepo;
	
	public List<Previsao> listarTodos() {
		return previsaoRepo.findAll();
	}
}
