package ejercicio_01;
//Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
//y “b”. Su código puede arrancar (por ejemplo):

public class Ejercicio_01_A {

	public static void main(String[] args) {
		int numeroInicio = 5, numeroFin = 14;

		while (numeroInicio <= numeroFin) {
			System.out.print(numeroInicio + ", ");
			numeroInicio++;
		}
		
		System.out.print("Agregado desde gitHub");
	}

}
