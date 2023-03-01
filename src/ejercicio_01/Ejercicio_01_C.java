package ejercicio_01;
import java.util.Scanner;

//A lo anterior, solo muestre los números pares

public class Ejercicio_01_C {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int numeroInicio = 5, numeroFin = 14, opcion;

		do {
			System.out.println("Ingrese una opcion para elegir mostrar los numeros pares o impares");
			System.out.println("Par: opcion (1)");
			System.out.println("Impar: opcion (2)");
			System.out.print("opcion: ");
			opcion = Integer.parseInt(input.nextLine());

		} while (opcion != 1 && opcion != 2);

		switch (opcion) {
		case 1:
			while (numeroInicio <= numeroFin) {
				if (numeroInicio % 2 == 0) {
					System.out.print(numeroInicio + ", ");
				}

				numeroInicio++;
			}

			break;

		case 2:
			while (numeroInicio <= numeroFin) {
				if (numeroInicio % 2 != 0) {
					System.out.print(numeroInicio + ", ");
				}

				numeroInicio++;
			}
			break;
		}

	}

}
