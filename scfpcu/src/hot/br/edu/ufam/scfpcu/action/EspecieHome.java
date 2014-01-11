package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("especieHome")
public class EspecieHome extends EntityHome<Especie> {

	public void setEspecieIdEspecie(Integer id) {
		setId(id);
	}

	public Integer getEspecieIdEspecie() {
		return (Integer) getId();
	}

	@Override
	protected Especie createInstance() {
		Especie especie = new Especie();
		return especie;
	}

	public void load() {
		if (isIdDefined()) {
			wire();
		}
	}

	public void wire() {
		getInstance();
	}

	public boolean isWired() {
		return true;
	}

	public Especie getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Veiculo> getVeiculos() {
		return getInstance() == null ? null : new ArrayList<Veiculo>(
				getInstance().getVeiculos());
	}
	public List<Veiculo> getVeiculos_1() {
		return getInstance() == null ? null : new ArrayList<Veiculo>(
				getInstance().getVeiculos_1());
	}

}
