package br.usjt.previsoes.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @Table(name="cidade")
public class Cidades {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column (nullable = false, length=20)
	private String cidade;
	@Column (nullable = false, length=20)
	private int latitude;
	@Column (nullable = false, length=20)
	private int longitude;
	
	@OneToMany (mappedBy = "cidade", cascade = CascadeType.ALL)
	private List<Previsao> previsao;
}
