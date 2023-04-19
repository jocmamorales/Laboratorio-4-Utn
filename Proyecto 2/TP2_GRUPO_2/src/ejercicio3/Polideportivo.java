package ejercicio3;

public class Polideportivo extends Edificio implements InstalacionDeportiva {
	private String nombre;

	public Polideportivo(String nombre, double superficie) {
		super(superficie);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSuperficiePolideportivo() {
		return super.getSuperficieEdificio();
	}
	
	@Override
	public int getTipoInstalacion() {
		// TODO Auto-generated method stub
		
		return 0;
	}
	
	public String toString() {
		return "El polideportivo " + this.nombre + " es una instalación de tipo " + this.getTipoInstalacion() + " - " + super.toString();
	}

}
