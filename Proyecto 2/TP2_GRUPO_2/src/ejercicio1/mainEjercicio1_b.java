package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

import ejercicio1.Profesor;

public class mainEjercicio1_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio_b();
	}

	public static void ejercicio_b() {

		TreeSet<Profesor> listProfesores = new TreeSet<Profesor>();

		listProfesores.add(new Profesor("Carlos 1", 30, "Titular", 5));
		listProfesores.add(new Profesor("Carlos 2", 31, "Suplente", 4));
		listProfesores.add(new Profesor("Carlos 3", 32, "Titular", 3));
		listProfesores.add(new Profesor("Carlos 4", 33, "Suplente", 2));
		listProfesores.add(new Profesor("Carlos 5", 34, "Titular", 1));

		Iterator<Profesor> it = listProfesores.iterator();
		while (it.hasNext()) {
			Profesor profe = it.next();
			it.remove();
			System.out.println(profe.toString());
		}
		
		Profesor profA = new Profesor("Esteban", 40, "Jefe de Catedra", 10);
		Profesor profB = new Profesor("Esteban", 40, "Jefe de Catedra", 10);
		
		if(profA.equals(profB)) {
			System.out.println("Es el mismo profesor.");
		}
	}
}
