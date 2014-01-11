package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("modeloList")
public class ModeloList extends EntityQuery<Modelo> {

	private static final String EJBQL = "select modelo from Modelo modelo";

	private static final String[] RESTRICTIONS = {"lower(modelo.modelo) like lower(concat(#{modeloList.modelo.modelo},'%'))",};

	private Modelo modelo = new Modelo();

	public ModeloList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Modelo getModelo() {
		return modelo;
	}
}
