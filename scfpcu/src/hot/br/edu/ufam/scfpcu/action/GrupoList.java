package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("grupoList")
public class GrupoList extends EntityQuery<Grupo> {

	private static final String EJBQL = "select grupo from Grupo grupo";

	private static final String[] RESTRICTIONS = {"lower(grupo.tipoGrupo) like lower(concat(#{grupoList.grupo.tipoGrupo},'%'))",};

	private Grupo grupo = new Grupo();

	public GrupoList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Grupo getGrupo() {
		return grupo;
	}
}
