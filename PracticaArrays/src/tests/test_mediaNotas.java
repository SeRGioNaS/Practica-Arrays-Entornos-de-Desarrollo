package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import util.MisArrays;

class test_mediaNotas {

	static int[] Array1;
	static int[] Array2;
	/**
	 * Test que comprueba la instanciacion de los arrays
	 */
	@BeforeAll
	static void setUp() {
		Array1 = new int[]{ 6, 8, 4, 7, 3 };
		Array2 = new int[]{ -1, 9, 5, 3, 4 };

	}
	/**
	 * Comprueba que la media es correcta
	 */
	@Test
	void testMediaValida() {
		float esperada = (float) 5.6;
		float obtenida = MisArrays.mediaNotas(Array1);
		assertEquals(esperada, obtenida);
	}
	/**
	 * Comprueba que los valores no son validos
	 */
	@Test
	void testMediaNoValida() {
		assertThrows(IllegalArgumentException.class, () -> MisArrays.mediaNotas(Array2));
		
	}

}
