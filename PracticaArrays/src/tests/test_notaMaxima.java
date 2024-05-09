package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import util.MisArrays;

class test_notaMaxima {

	int[] Array1;
	int[] Array2;
	/**
	 * Test que comprueba la instanciacion de los arrays
	 */
	@BeforeAll
	static void setUp() {
		int[] Array1 = new int []{ 6, 8, 4, 7, 3 };
		int[] Array2 = new int []{ -1, 9, 5, 3, 4 };
	}
	
	/**
	 * 
	 * Comprueba que la nota maxima es correcta
	 */
	@Test
	void testNotaMaxima() {
		int obtenido = MisArrays.maximo(Array1);
		assertEquals(8, obtenido);
	}

}
