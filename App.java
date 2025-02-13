package Estudiante;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		Scanner st = new Scanner(System.in);
		Estudiante[] estudiante = new Estudiante[100];

		main(sn, st, estudiante);

	}

	private static void main(Scanner sn, Scanner st, Estudiante[] estudiante) {

		int flag = 0, contador = 0;

		do {
			System.out.println("Pulsa 1. Para ingresar nuevo alumno");
			System.out.println("Pulsa 2. Para ver numero de Alumnos");
			System.out.println("Pulsa 3. Para salir Papi!");
			flag = sn.nextInt();
			switch (flag) {
			case 1:
				if (contador < estudiante.length) {
					System.out.println("Nombre del nuevo alumno:");
					String nombre = st.nextLine();
					System.out.println("Edad del nuevo alumno:");
					int edad = sn.nextInt();
					System.out.println("Nota media del nuevo alumno:");
					float notaMedia = sn.nextFloat();

					estudiante[contador] = new Estudiante(nombre, edad, notaMedia);
					contador++;

					System.out.println("Alumno registrado correctamente.\n");
				} else {
					System.out.println("No hay espacio para más alumnos.\n");
				}
				break;
			case 2:
				System.out.println("Numero de alumnos registrados: " + Estudiante.totalEstudiantes);
				break;

			default:
				break;
			}
		} while (flag != 3);

	}

}
