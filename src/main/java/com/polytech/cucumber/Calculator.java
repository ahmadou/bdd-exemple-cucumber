package com.polytech.cucumber;

import org.apache.commons.lang3.ObjectUtils;

/**
 * Demo class for sample calculator
 * @author dioufa
 *
 */
public class Calculator {
	
	/**
	 * Retourne le résultat de l'addition de a et b
	 * @param operand1
	 * @param operand2
	 * @return
	 */
	public Float add(Float operand1, Float operand2) {
		checkInputParameters(operand1,operand2);
		return operand1.floatValue() + operand2.floatValue();
	}
	
	/**
	 * Valide les parametres d'entrée
	 * @param operand1
	 * @param operand2
	 */
	private void checkInputParameters(Float operand1, Float operand2) {
		if (!ObjectUtils.allNotNull(operand1,operand2)) {
			throw new IllegalArgumentException("Aucun paramètre ne doit être null");		
		}
	}

	/**
	 * Retourne le résultat de la soustraction entre a et b
	 * @param operand1
	 * @param operand2
	 * @return
	 */
	public Float substract(Float operand1, Float operand2) {
		checkInputParameters(operand1,operand2);
		return operand1.floatValue() - operand2.floatValue();
	}
	
	/**
	 * Retourne le résultat de la multiplication entre a et b
	 * @param operand1
	 * @param operand2
	 * @return
	 */
	public Float multiply(Float operand1, Float operand2) {
		checkInputParameters(operand1,operand2);
		return operand1.floatValue() * operand2.floatValue();
	}
	
	/**
	 * Retourne le résultat de la division entre a et b
	 * @param operand1
	 * @param operand2
	 * @return
	 */
	public Float divide(Float operand1, Float operand2) {
		checkInputParameters(operand1,operand2);
		if (operand2 ==0) {
			throw new IllegalArgumentException("La valeur de b ne peut être égalle à zero");
		}
		return operand1.floatValue() - operand2.floatValue();
	}

}
