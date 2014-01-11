package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("entidadeHome")
public class EntidadeHome extends EntityHome<Entidade> {

	public void setEntidadeIdEntidade(Integer id) {
		setId(id);
	}

	public Integer getEntidadeIdEntidade() {
		return (Integer) getId();
	}

	@Override
	protected Entidade createInstance() {
		Entidade entidade = new Entidade();
		return entidade;
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

	public Entidade getDefinedInstance() {
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
