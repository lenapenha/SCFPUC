package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("marcaList")
public class MarcaList extends EntityQuery<Marca> {

	private static final String EJBQL = "select marca from Marca marca";

	private static final String[] RESTRICTIONS = {"lower(marca.marca) like lower(concat(#{marcaList.marca.marca},'%'))",};

	private Marca marca = new Marca();

	public MarcaList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Marca getMarca() {
		return marca;
	}
}
