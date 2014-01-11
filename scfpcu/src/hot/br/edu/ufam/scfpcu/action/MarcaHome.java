package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("marcaHome")
public class MarcaHome extends EntityHome<Marca> {

	public void setMarcaIdMarca(Integer id) {
		setId(id);
	}

	public Integer getMarcaIdMarca() {
		return (Integer) getId();
	}

	@Override
	protected Marca createInstance() {
		Marca marca = new Marca();
		return marca;
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

	public Marca getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Modelo> getModelos() {
		return getInstance() == null ? null : new ArrayList<Modelo>(
				getInstance().getModelos());
	}
	public List<Modelo> getModelos_1() {
		return getInstance() == null ? null : new ArrayList<Modelo>(
				getInstance().getModelos_1());
	}

}
