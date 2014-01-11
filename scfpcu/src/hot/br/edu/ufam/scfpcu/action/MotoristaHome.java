package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("motoristaHome")
public class MotoristaHome extends EntityHome<Motorista> {

	public void setMotoristaIdMotorista(Integer id) {
		setId(id);
	}

	public Integer getMotoristaIdMotorista() {
		return (Integer) getId();
	}

	@Override
	protected Motorista createInstance() {
		Motorista motorista = new Motorista();
		return motorista;
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

	public Motorista getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}
