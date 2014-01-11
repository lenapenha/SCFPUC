package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("motoristaList")
public class MotoristaList extends EntityQuery<Motorista> {

	private static final String EJBQL = "select motorista from Motorista motorista";

	private static final String[] RESTRICTIONS = {
			"lower(motorista.bairro) like lower(concat(#{motoristaList.motorista.bairro},'%'))",
			"lower(motorista.nome) like lower(concat(#{motoristaList.motorista.nome},'%'))",
			"lower(motorista.num) like lower(concat(#{motoristaList.motorista.num},'%'))",
			"lower(motorista.rua) like lower(concat(#{motoristaList.motorista.rua},'%'))",
			"lower(motorista.tipocnh) like lower(concat(#{motoristaList.motorista.tipocnh},'%'))",};

	private Motorista motorista = new Motorista();

	public MotoristaList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Motorista getMotorista() {
		return motorista;
	}
}
