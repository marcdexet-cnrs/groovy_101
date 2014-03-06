package org.devlog.groovy101;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Les assertions sont les gardiennes de la vérité.
 * Elles dorment tant que la vérité est vérifiée, mais se réveillent
 * quand elle est bafouée, lançant des exceptions, c'est à dire des cris d'horreur
 * en Java/groovy.
 * 
 * Les assertions vont nous permettrent de trouver le chemin de l'apprentissage.
 * @author MDE
 *
 */
class G01Assert {

	/**
	 * Voici la forme la plus simple des assertions
	 */
	@Test 
	void assertionsSimples() {
		assert true;
		assert ! false
		assert "something"
		assert "something with a comment": "This is my comment"
	}
	
	/**
	 * Voici un exemple d'assertion Groovy pas contente !
	 */
	@Test 
	void assertionsPasContentes() {
		boolean truth = false
		assert truth : "Qui ose me réveiller ainsi ??"
	}
	
	/** 
	 * Le même type de gardienne mais du côté de Junit
	 */
	@Test
	void assertionsJunitPasContentes() {
		boolean truth = false
		assertTrue("Qui ose me réveiller ainsi ??", truth)
	}

}
