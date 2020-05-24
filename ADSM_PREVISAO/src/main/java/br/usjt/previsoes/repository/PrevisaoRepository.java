package br.usjt.previsoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.usjt.previsoes.model.Previsao;

@Repository
public interface PrevisaoRepository extends JpaRepository<Previsao, Long>{

}
