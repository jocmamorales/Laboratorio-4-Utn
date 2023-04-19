package ejercicio2;

public class Producto {
	private String fechaCaducidad;
    private String numeroLote;
    
    //Constructor
    
    public Producto(String fechaCaducidad, String numeroLote  ) {
    	this.fechaCaducidad = fechaCaducidad;
    	this.numeroLote = numeroLote;
	}
    
    //Getters and setters
    
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public String getNumeroLote() {
		return numeroLote;
	}
	public void setNumeroLote(String numeroLote) {
		this.numeroLote = numeroLote;
	}

	@Override
	public String toString() {
		return " Fecha de Caducidad: " + fechaCaducidad + ", Numero de lote: " + numeroLote + "]";
	}
    
	
    
}
