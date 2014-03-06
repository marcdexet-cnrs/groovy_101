package org.devlog.groovy101;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Les assertions sont les gardiennes de la v�rit�.
 * Elles dorment tant que la v�rit� est v�rifi�e, mais se r�veillent
 * quand elle est bafou�e, lan�ant des exceptions, c'est � dire des cris d'horreur
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
		assert truth : "Qui ose me r�veiller ainsi ??"
	}
	
	/** 
	 * Le m�me type de gardienne mais du c�t� de Junit
	 */
	@Test
	void assertionsJunitPasContentes() {
		boolean truth = false
		assertTrue("Qui ose me r�veiller ainsi ??", truth)
	}

}
