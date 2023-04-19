package ejercicio2;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio2 {

	public static void main(String[] args) {
		
		Producto congelado = new ProductoCongelado("2-2","C23","57");
		Producto fresco = new ProductoFresco("2-2","F25"," 3-12", "Uruguay");
		Producto refrigerado = new ProductoRefrigerados("2-2","R25", 3724);

		ArrayList<Producto> listaProductos = new ArrayList<Producto>();

		listaProductos.add(congelado);
		listaProductos.add(fresco);
		listaProductos.add(refrigerado);

		ListIterator<Producto> it = listaProductos.listIterator();
		
		while (it.hasNext()) {
			Producto producto = it.next();
			System.out.println(producto.toString());
		}
	}

}
