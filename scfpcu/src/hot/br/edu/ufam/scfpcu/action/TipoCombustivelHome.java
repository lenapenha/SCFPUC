package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("tipoCombustivelHome")
public class TipoCombustivelHome extends EntityHome<TipoCombustivel> {

	public void setTipoCombustivelIdCombustivel(Integer id) {
		setId(id);
	}

	public Integer getTipoCombustivelIdCombustivel() {
		return (Integer) getId();
	}

	@Override
	protected TipoCombustivel createInstance() {
		TipoCombustivel tipoCombustivel = new TipoCombustivel();
		return tipoCombustivel;
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

	public TipoCombustivel getDefinedInstance() {
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
	public List<Veiculo> getVeiculos() {
		return getInstance() == null ? null : new ArrayList<Veiculo>(
				getInstance().getVeiculos());
	}
	public List<Veiculo> getVeiculos_1() {
		return getInstance() == null ? null : new ArrayList<Veiculo>(
				getInstance().getVeiculos_1());
	}

}
