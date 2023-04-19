package ejercicio2;

public class ProductoCongelado extends Producto {
	
	 private String temp_congelacion;
	 
	 //Constructores 
	 

		public ProductoCongelado(String fechaCaducidad, String numeroLote, String temp_congelacion) {
			super(fechaCaducidad,numeroLote);
			this.temp_congelacion = temp_congelacion;

	   }

	 
	 //Setters y getters
	 
	public String getTempcongelacion() {
		return temp_congelacion;
	}

	public void setTempcongelacion(String temp_congelacion) {
		this.temp_congelacion = temp_congelacion;
	}


	@Override
	public String toString() {
		return "ProductoCongelado: Temperatura de Congelacion °" + temp_congelacion + super.toString();
	}
	

	 
}
