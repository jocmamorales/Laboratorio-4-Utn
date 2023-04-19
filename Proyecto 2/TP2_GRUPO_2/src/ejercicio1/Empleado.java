package ejercicio1;

public class Empleado {	

	private final int id;
	private String nombre;
	private int edad;	
	private static int legajo = 999; // Inicializamos en 999 para que el primer ID sea 1000
	public Empleado() {

		Empleado.legajo++;

		this.id = Empleado.legajo;
		this.nombre = "Sin Nombre";
		this.edad = 99;
	}

	public Empleado(String nombre, int edad) {

		Empleado.legajo++;

		this.id = Empleado.legajo;
		this.nombre = nombre;
		this.edad = edad;
	}

	public int getId() {
		return id;
	}	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Empleado:  " + nombre + ", edad: " + edad + ", legajo: " + id + " ";
	}

	/**
	 * @return Legajo que se le asignar� al pr�ximo Empleado que se cree
	*/
	
	public static int devuelveProximoID() {
		return Empleado.legajo + 1;
	}
	 
	public boolean equals(Empleado otro) {
		return
				(this == otro) ||
				(this.id == otro.id &&
				this.nombre == otro.nombre &&
				this.edad == otro.edad
				);
	}
}
