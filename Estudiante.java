package Estudiante;

public class Estudiante {
	private String nombre;
	private int edad;
	private float notaMedia;
	public static int totalEstudiantes;

	public Estudiante(String nombre, int edad, float notaMedia) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setNotaMedia(notaMedia);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		totalEstudiantes++;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {

		if (edad > 5) {
			this.edad = edad;
		} else {
			System.err.println("la edad no puede ser inferior al 5, por defecto tienes 18 ahora\n");
			this.edad = 18;
		}

	}

	public float getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(float notaMedia) {
		if (notaMedia >= 0 && notaMedia <= 10) {
			this.notaMedia = notaMedia;
		} else {
			System.err.println("la media fuera de rango 0 - 10, por defecto tienes 0 ahora\n");
			this.notaMedia = 0;
		}

	}
	

}
