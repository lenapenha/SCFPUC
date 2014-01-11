package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("cidadesList")
public class CidadesList extends EntityQuery<Cidades> {

	private static final String EJBQL = "select cidades from Cidades cidades";

	private static final String[] RESTRICTIONS = {
			"lower(cidades.nome) like lower(concat(#{cidadesList.cidades.nome},'%'))",
			"lower(cidades.uf) like lower(concat(#{cidadesList.cidades.uf},'%'))",};

	private Cidades cidades = new Cidades();

	public CidadesList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Cidades getCidades() {
		return cidades;
	}
}
