package util;

public abstract class MisArrays {
	/**
	 *Metodo que devuelve la media de las notas ingresadas en el array
	 * 
	 * @param array		Almacena las notas
	 * 
	 * @param total		Almacena la suma de las notas
	 * 
	 * @param media		Almacena la division de la suma total entre el numero de notas del array
	 * 
	 * @return
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

}
