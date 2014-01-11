package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("corList")
public class CorList extends EntityQuery<Cor> {

	private static final String EJBQL = "select cor from Cor cor";

	private static final String[] RESTRICTIONS = {"lower(cor.nome) like lower(concat(#{corList.cor.nome},'%'))",};

	private Cor cor = new Cor();

	public CorList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Cor getCor() {
		return cor;
	}
}
