package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("tipoServicoHome")
public class TipoServicoHome extends EntityHome<TipoServico> {

	public void setTipoServicoIdServico(Integer id) {
		setId(id);
	}

	public Integer getTipoServicoIdServico() {
		return (Integer) getId();
	}

	@Override
	protected TipoServico createInstance() {
		TipoServico tipoServico = new TipoServico();
		return tipoServico;
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

	public TipoServico getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Gastos> getGastoses() {
		return getInstance() == null ? null : new ArrayList<Gastos>(
				getInstance().getGastoses());
	}
	public List<Gastos> getGastoses_1() {
		return getInstance() == null ? null : new ArrayList<Gastos>(
				getInstance().getGastoses_1());
	}

}
