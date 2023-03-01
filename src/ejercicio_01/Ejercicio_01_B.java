package ejercicio_01;
//A lo anterior, solo muestre los números pares

public class Ejercicio_01_B {
	public static void main(String[] args) {
		int numeroInicio = 5, numeroFin = 14;

		while (numeroInicio <= numeroFin) {
			if (numeroInicio % 2 == 0) {
				System.out.print(numeroInicio + ", ");
			}

			numeroInicio++;
		}
	}

}
