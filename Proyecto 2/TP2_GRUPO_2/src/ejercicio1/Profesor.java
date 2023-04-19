package ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor> {

	private String cargo;
	private int antiguedadDocente;

	public Profesor() {

	}

	public Profesor(String nombre, int edad, String cargo, int antiguedadDocente) {
		super(nombre, edad);
		this.cargo = cargo;
		this.antiguedadDocente = antiguedadDocente;
	}

	// gets y sets
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}

	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}

	@Override
	public String toString() {
		return "Profesor [cargo=" + cargo + ", antiguedadDocente=" + antiguedadDocente + "," + super.toString() + "]";
	}

	@Override
	public int compareTo(Profesor arg0) {
		// TODO Auto-generated method stub
		if (arg0.getId() == this.getId())
			return 0;

		if (arg0.getId() < this.getId())
			return 1;

		return -1;
	}
	
	public boolean equals(Profesor otro) {
		return 
				(this == otro) ||
				(this.cargo == otro.cargo &&
				this.antiguedadDocente == otro.antiguedadDocente &&
				super.equals(otro));
	}

}
