package br.edu.ufam.scfpcu.model;
// Generated Jan 9, 2014 11:42:56 PM by Hibernate Tools 3.2.4.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MotVeic generated by hbm2java
 */
@Entity
@Table(name = "mot_veic", catalog = "scfpcu")
public class MotVeic implements java.io.Serializable {

	private Integer id;
	private int idMotorista;
	private int idVeiculo;

	public MotVeic() {
	}

	public MotVeic(int idMotorista, int idVeiculo) {
		this.idMotorista = idMotorista;
		this.idVeiculo = idVeiculo;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "id_motorista", nullable = false)
	public int getIdMotorista() {
		return this.idMotorista;
	}

	public void setIdMotorista(int idMotorista) {
		this.idMotorista = idMotorista;
	}

	@Column(name = "id_veiculo", nullable = false)
	public int getIdVeiculo() {
		return this.idVeiculo;
	}

	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

}
