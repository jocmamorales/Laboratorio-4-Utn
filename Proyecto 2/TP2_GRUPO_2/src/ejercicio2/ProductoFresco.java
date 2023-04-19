package ejercicio2;

public class ProductoFresco extends Producto{
	 
	 private String fecha_envasado;
	 private String pais_origen;
	 
	 //Constructor
	 
		public ProductoFresco(String fechaCaducidad, String numeroLote, String fecha_envasado, String pais_origen) {
			super(fechaCaducidad,numeroLote);
			this.fecha_envasado = fecha_envasado;
			this.pais_origen = pais_origen;
		}

	 
	public String getFechaenvasado() {
		return fecha_envasado;
	}
	public void setFechaenvasado(String fechaenvasado) {
		this.fecha_envasado = fechaenvasado;
	}
	public String getPaisorigen() {
		return pais_origen;
	}
	public void setPaisorigen(String paisorigen) {
		this.pais_origen = paisorigen;
	}


	@Override
	public String toString() {
		return "ProductoFresco: Fecha de Envasado: " + fecha_envasado + ", Pais de Origen: " + pais_origen + super.toString();
	}
	
	
	 
}
