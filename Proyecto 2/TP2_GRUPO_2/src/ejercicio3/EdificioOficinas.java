package ejercicio3;

public class EdificioOficinas extends Edificio {

	private int cantidadOficinas = 0;

	public EdificioOficinas(double superficieEdificio, int cantOficinas) {
		super(superficieEdificio);
		this.cantidadOficinas = cantOficinas;
	}

	public int getCantidadOficinas() {
		return cantidadOficinas;
	}
	
	public String toString() {
		return super.toString() + " y " + cantidadOficinas + " oficinas";
	}
}
