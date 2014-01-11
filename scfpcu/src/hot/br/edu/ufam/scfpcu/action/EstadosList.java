package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("estadosList")
public class EstadosList extends EntityQuery<Estados> {

	private static final String EJBQL = "select estados from Estados estados";

	private static final String[] RESTRICTIONS = {
			"lower(estados.nome) like lower(concat(#{estadosList.estados.nome},'%'))",
			"lower(estados.uf) like lower(concat(#{estadosList.estados.uf},'%'))",};

	private Estados estados = new Estados();

	public EstadosList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Estados getEstados() {
		return estados;
	}
}
