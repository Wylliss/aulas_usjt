package br.usjt.previsoes.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @Table(name="previsao")
public class Previsao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column (nullable = false, length=20)
	private int tempmin;
	@Column (nullable = false, length=20)
	private int tempmax;
	@Column (nullable = false, length=20)
	private int umidade;
	@Column (nullable = false, length=20)
	private Date data;
	@Column (nullable = false, length=20)
	private String descricao;
	
	@OneToOne (optional = false)
	@JoinColumn (name = "diadasemana")
	private Diadasemana diadasemana;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Cidades cidade;
}
