package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("corHome")
public class CorHome extends EntityHome<Cor> {

	public void setCorIdCor(Integer id) {
		setId(id);
	}

	public Integer getCorIdCor() {
		return (Integer) getId();
	}

	@Override
	protected Cor createInstance() {
		Cor cor = new Cor();
		return cor;
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

	public Cor getDefinedInstance() {
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
