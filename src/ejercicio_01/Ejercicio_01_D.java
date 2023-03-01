package ejercicio_01;
//A lo anterior, solo muestre los números pares

public class Ejercicio_01_D {
	public static void main(String[] args) {
		int numeroInicio = 5, numeroFin = 14;

		for (int i = numeroFin; i >= numeroInicio; i--) {
			if (i % 2 == 0) {
				System.out.print(i + ", ");
			}

		}
	}

}
