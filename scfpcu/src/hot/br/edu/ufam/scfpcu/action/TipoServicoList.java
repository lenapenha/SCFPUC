package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("tipoServicoList")
public class TipoServicoList extends EntityQuery<TipoServico> {

	private static final String EJBQL = "select tipoServico from TipoServico tipoServico";

	private static final String[] RESTRICTIONS = {"lower(tipoServico.servico) like lower(concat(#{tipoServicoList.tipoServico.servico},'%'))",};

	private TipoServico tipoServico = new TipoServico();

	public TipoServicoList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public TipoServico getTipoServico() {
		return tipoServico;
	}
}
