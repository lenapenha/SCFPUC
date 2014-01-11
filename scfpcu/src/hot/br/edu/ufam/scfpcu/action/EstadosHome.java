package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("estadosHome")
public class EstadosHome extends EntityHome<Estados> {

	public void setEstadosId(Integer id) {
		setId(id);
	}

	public Integer getEstadosId() {
		return (Integer) getId();
	}

	@Override
	protected Estados createInstance() {
		Estados estados = new Estados();
		return estados;
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

	public Estados getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Cidades> getCidadeses() {
		return getInstance() == null ? null : new ArrayList<Cidades>(
				getInstance().getCidadeses());
	}
	public List<Cidades> getCidadeses_1() {
		return getInstance() == null ? null : new ArrayList<Cidades>(
				getInstance().getCidadeses_1());
	}

}
