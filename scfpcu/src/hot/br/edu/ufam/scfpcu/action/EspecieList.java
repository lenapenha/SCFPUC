package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("especieList")
public class EspecieList extends EntityQuery<Especie> {

	private static final String EJBQL = "select especie from Especie especie";

	private static final String[] RESTRICTIONS = {"lower(especie.especie) like lower(concat(#{especieList.especie.especie},'%'))",};

	private Especie especie = new Especie();

	public EspecieList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Especie getEspecie() {
		return especie;
	}
}
