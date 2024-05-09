package util;

import java.util.Arrays;

public abstract class MisArrays {
	/**
	 * Metodo que devuelve la media de las notas ingresadas en el array
	 * 
	 * @param array Almacena las notas
	 * 
	 * @param total Almacena la suma de las notas
	 * 
	 * @param media Almacena la division de la suma total entre el numero de notas
	 *              del array
	 * 
	 * @return La media del array
	 */
	public static float mediaNotas(int[] array) {
		int total = 0;
		float media;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0 || array[i] > 10) {
				throw new IllegalArgumentException("El número debe estar entre 0 y 10");
			} else {
				total = total + array[i];

			}
		}
		media = (float) total / array.length;
		return media;
	}

	/**
	 * Metodo que devuelve la maxima nota ingresada en el array
	 * 
	 * @param array  Almacena las notas
	 * 
	 * @param maximo Almacena la nota maxima
	 * 
	 * @return La nota maxima del array
	 */
	public static int maximo(int[] array) {
		int maximo = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0 || array[i] > 10) {
				throw new IllegalArgumentException("El número debe estar entre 0 y 10");
			} else {
				if (array[i] > maximo) {
					maximo = array[i];
				}
			}
		}
		return maximo;
	}

	public static float medianaNotas(int[] array) {
		float mediana = 0;
		Arrays.sort(array);
		if (array.length % 2 == 0) {

		}
		return mediana;
	}

}
