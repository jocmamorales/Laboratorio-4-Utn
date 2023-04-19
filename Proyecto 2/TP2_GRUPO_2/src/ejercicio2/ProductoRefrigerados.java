package ejercicio2;

public class ProductoRefrigerados extends Producto {

	private int cod_organismo;
	
	public ProductoRefrigerados(String fechaCaducidad, String numeroLote, int cod_organismo) {
		super(fechaCaducidad,numeroLote);
		this.cod_organismo = cod_organismo;
	}


	public int getCod_organismo() {
		return cod_organismo;
	}

	public void setCod_organismo(int cod_organismo) {
		this.cod_organismo = cod_organismo;
	}


	@Override
	public String toString() {
		return "Productos Refrigerados:  Codigo de Organismo: " + cod_organismo + super.toString();
	}
	
	
}
