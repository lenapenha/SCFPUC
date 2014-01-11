package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("motVeicHome")
public class MotVeicHome extends EntityHome<MotVeic> {

	public void setMotVeicId(Integer id) {
		setId(id);
	}

	public Integer getMotVeicId() {
		return (Integer) getId();
	}

	@Override
	protected MotVeic createInstance() {
		MotVeic motVeic = new MotVeic();
		return motVeic;
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

	public MotVeic getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}
