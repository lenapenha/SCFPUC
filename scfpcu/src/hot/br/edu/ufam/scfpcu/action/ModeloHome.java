package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("modeloHome")
public class ModeloHome extends EntityHome<Modelo> {

	@In(create = true)
	MarcaHome marcaHome;

	public void setModeloIdModelo(Integer id) {
		setId(id);
	}

	public Integer getModeloIdModelo() {
		return (Integer) getId();
	}

	@Override
	protected Modelo createInstance() {
		Modelo modelo = new Modelo();
		return modelo;
	}

	public void load() {
		if (isIdDefined()) {
			wire();
		}
	}

	public void wire() {
		getInstance();
		Marca marca = marcaHome.getDefinedInstance();
		if (marca != null) {
			getInstance().setMarca(marca);
		}
	}

	public boolean isWired() {
		if (getInstance().getMarca() == null)
			return false;
		return true;
	}

	public Modelo getDefinedInstance() {
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
