package br.usjt.helloSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository; 

import br.usjt.helloSpringBoot.model.Aluno;

public interface AlunosRepository extends JpaRepository<Aluno, Long>{

}
