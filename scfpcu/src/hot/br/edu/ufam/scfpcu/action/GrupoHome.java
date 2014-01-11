package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("grupoHome")
public class GrupoHome extends EntityHome<Grupo> {

	public void setGrupoIdGrupo(Integer id) {
		setId(id);
	}

	public Integer getGrupoIdGrupo() {
		return (Integer) getId();
	}

	@Override
	protected Grupo createInstance() {
		Grupo grupo = new Grupo();
		return grupo;
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

	public Grupo getDefinedInstance() {
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
