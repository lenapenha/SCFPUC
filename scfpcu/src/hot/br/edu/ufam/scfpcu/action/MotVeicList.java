package br.edu.ufam.scfpcu.action;

import br.edu.ufam.scfpcu.model.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("motVeicList")
public class MotVeicList extends EntityQuery<MotVeic> {

	private static final String EJBQL = "select motVeic from MotVeic motVeic";

	private static final String[] RESTRICTIONS = {};

	private MotVeic motVeic = new MotVeic();

	public MotVeicList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public MotVeic getMotVeic() {
		return motVeic;
	}
}
