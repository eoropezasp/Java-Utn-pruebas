package ejercicio_02;

import java.util.Scanner;

public class Ejercicio_01_4 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		final double INGRESOS_MAX = 489083;
		final int AUTOS_MAX = 3, INMUEBLES_MAX = 3;

		double ingresos;
		int cantAutos, inmuebles;
		char respuesta;

		System.out.print("Ingrese su cantidad de ingresos $$$: ");
		ingresos = Double.parseDouble(input.nextLine());
		if (ingresos >= INGRESOS_MAX) {
			System.out.println("Si pertenece al segmento de ingresos altos");
		} else {
			System.out.print("Ingrese su cantidad de vehiculos con antiguedad menor a 5 años: ");
			cantAutos = Integer.parseInt(input.nextLine());
			if (cantAutos >= AUTOS_MAX) {
				System.out.println("Si pertenece al segmento de ingresos altos");
			} else {
				System.out.print("Ingrese su cantidad de inmuebles en posesion: ");
				inmuebles = Integer.parseInt(input.nextLine());
				if (inmuebles >= INMUEBLES_MAX) {
					System.out.println("Si pertenece al segmento de ingresos altos");
				} else {
					System.out.println("Posee una embarcacion, aeronave de lujo, o es titular de activos? (S/N): ");
					respuesta = input.nextLine().toLowerCase().charAt(0);
					if (respuesta == 's') {
						System.out.println("Si pertenece al segmento de ingresos altos");
					} else {
						System.out.println("No pertenece al segmento de ingresos altos");
					}
				}

			}

		}

	}
}
