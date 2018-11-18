package com.polytech.cucumber;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Lorsque;
import cucumber.api.java.fr.Soit;

/**
 * Bibliothèque d'étapes de test
 * @author dioufa
 *
 */
public class Stepdefs {
	
	private Float operande1;
	private Float operande2;
	private Calculator calculator;
	
	@Soit("^deux operandes a et b$")
	public void deux_operandes_a_et_b() throws Exception {
		calculator = new Calculator();
	    operande1=0f;
	    operande2=0f;
	}
	
	@Lorsque("^je donne à a la valeur \"([^\"]*)\"$")
	public void je_donne_à_a_la_valeur(String valeur) throws Exception {
		operande1= new Float(valeur);
	}

	@Lorsque("^je donne à b la valeur \"([^\"]*)\"$")
	public void je_donne_à_b_la_valeur(String valeur) throws Exception {
		operande2= new Float(valeur);
	}

	@Alors("^a plus b doit me donner la valeur entière \"([^\"]*)\"$")
	public void a_plus_b_doit_me_donner_la_valeur_entière(String valeur) throws Exception {
		assertEquals(new Float(valeur),calculator.add(operande1, operande2));
	}


		
}