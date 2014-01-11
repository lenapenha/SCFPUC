package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("cidadesHome")
public class CidadesHome extends EntityHome<Cidades> {

	@In(create = true)
	EstadosHome estadosHome;

	public void setCidadesIdCidade(Integer id) {
		setId(id);
	}

	public Integer getCidadesIdCidade() {
		return (Integer) getId();
	}

	@Override
	protected Cidades createInstance() {
		Cidades cidades = new Cidades();
		return cidades;
	}

	public void load() {
		if (isIdDefined()) {
			wire();
		}
	}

	public void wire() {
		getInstance();
		Estados estados = estadosHome.getDefinedInstance();
		if (estados != null) {
			getInstance().setEstados(estados);
		}
	}

	public boolean isWired() {
		if (getInstance().getEstados() == null)
			return false;
		return true;
	}

	public Cidades getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Veiculo> getVeiculosForIdCidadePanterior() {
		return getInstance() == null ? null : new ArrayList<Veiculo>(
				getInstance().getVeiculosForIdCidadePanterior());
	}
	public List<Veiculo> getVeiculosForIdCidadePanterior_1() {
		return getInstance() == null ? null : new ArrayList<Veiculo>(
				getInstance().getVeiculosForIdCidadePanterior_1());
	}
	public List<Veiculo> getVeiculosForIdCidadePatual() {
		return getInstance() == null ? null : new ArrayList<Veiculo>(
				getInstance().getVeiculosForIdCidadePatual());
	}
	public List<Veiculo> getVeiculosForIdCidadePatual_1() {
		return getInstance() == null ? null : new ArrayList<Veiculo>(
				getInstance().getVeiculosForIdCidadePatual_1());
	}

}
