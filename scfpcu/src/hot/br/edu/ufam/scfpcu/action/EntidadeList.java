package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("entidadeList")
public class EntidadeList extends EntityQuery<Entidade> {

	private static final String EJBQL = "select entidade from Entidade entidade";

	private static final String[] RESTRICTIONS = {"lower(entidade.tipoEntidade) like lower(concat(#{entidadeList.entidade.tipoEntidade},'%'))",};

	private Entidade entidade = new Entidade();

	public EntidadeList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Entidade getEntidade() {
		return entidade;
	}
}
