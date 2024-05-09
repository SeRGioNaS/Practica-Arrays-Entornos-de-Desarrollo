package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class test_notaMinima {

	static int[] Array1;
	static int[] Array2;
	/**
	 * Test que comprueba la instanciacion de los arrays
	 */
	@BeforeAll
	static void setUp() {
		Array1 = new int []{ 6, 8, 4, 7, 3 };
		Array2 = new int []{ -1, 9, 5, 3, 4 };
	}

	/**
	 * 
	 * Comprueba que la nota minima es correcta
	 */
	@Test
	void testNotaMinima() {
		int obtenido = MisArrays.minimo(Array1);
		assertEquals(3, obtenido);
	}

}
