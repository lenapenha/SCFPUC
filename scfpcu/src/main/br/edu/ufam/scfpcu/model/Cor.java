package br.edu.ufam.scfpcu.model;
// Generated Jan 9, 2014 11:42:56 PM by Hibernate Tools 3.2.4.GA

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * Cor generated by hbm2java
 */
@Entity
@Table(name = "cor", catalog = "scfpcu")
public class Cor implements java.io.Serializable {

	private Integer idCor;
	private String nome;
	private Set<Veiculo> veiculos = new HashSet<Veiculo>(0);
	private Set<Veiculo> veiculos_1 = new HashSet<Veiculo>(0);

	public Cor() {
	}

	public Cor(String nome) {
		this.nome = nome;
	}
	public Cor(String nome, Set<Veiculo> veiculos, Set<Veiculo> veiculos_1) {
		this.nome = nome;
		this.veiculos = veiculos;
		this.veiculos_1 = veiculos_1;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_cor", unique = true, nullable = false)
	public Integer getIdCor() {
		return this.idCor;
	}

	public void setIdCor(Integer idCor) {
		this.idCor = idCor;
	}

	@Column(name = "nome", nullable = false, length = 20)
	@NotNull
	@Length(max = 20)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cor")
	public Set<Veiculo> getVeiculos() {
		return this.veiculos;
	}

	public void setVeiculos(Set<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cor")
	public Set<Veiculo> getVeiculos_1() {
		return this.veiculos_1;
	}

	public void setVeiculos_1(Set<Veiculo> veiculos_1) {
		this.veiculos_1 = veiculos_1;
	}

}
