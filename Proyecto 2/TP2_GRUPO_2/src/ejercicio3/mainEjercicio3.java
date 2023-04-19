package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio3 {

	public static void main(String[] args) {
		ArrayList<Edificio> edificios = new ArrayList<Edificio> (5);
		edificios.add(new Polideportivo("A",125.5));
		edificios.add(new Polideportivo("B", 110.0));
		edificios.add(new Polideportivo("C", 100));
		edificios.add(new EdificioOficinas(110,60));
		edificios.add(new EdificioOficinas(110,115));
		
		Iterator<Edificio> edificiosIt = edificios.iterator();
		while(edificiosIt.hasNext()) {
			Edificio edificio = edificiosIt.next();
			System.out.println(edificio);
		}
	}
	
}
