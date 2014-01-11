package br.edu.ufam.scfpcu.action;

import javax.ejb.Local;

@Local
public interface Authenticator {

	boolean authenticate();

}
