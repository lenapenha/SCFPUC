package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("tipoCombustivelList")
public class TipoCombustivelList extends EntityQuery<TipoCombustivel> {

	private static final String EJBQL = "select tipoCombustivel from TipoCombustivel tipoCombustivel";

	private static final String[] RESTRICTIONS = {"lower(tipoCombustivel.tipoCombustivel) like lower(concat(#{tipoCombustivelList.tipoCombustivel.tipoCombustivel},'%'))",};

	private TipoCombustivel tipoCombustivel = new TipoCombustivel();

	public TipoCombustivelList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public TipoCombustivel getTipoCombustivel() {
		return tipoCombustivel;
	}
}
