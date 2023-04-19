package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio1_a {

	public static void main(String[] args) {
		
		Profesor p1 = new Profesor("Gabriel", 25,"Titular", 1);
		Profesor p2 = new Profesor("Jose", 42,"Titular", 2);
		Profesor p3 = new Profesor("Rober", 42,"Suplente", 3);
		Profesor p4 = new Profesor("Pedro", 28, "Titular", 4);
		Profesor p5 = new Profesor("Stef", 88, "Suplente", 5);

		ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();

		listaProfesores.add(p1);
		listaProfesores.add(p2);
		listaProfesores.add(p3);
		listaProfesores.add(p4);
		listaProfesores.add(p5);
		
		ListIterator<Profesor> it = listaProfesores.listIterator();
		
		while (it.hasNext()) {
			Profesor profesor = it.next();
			System.out.println(profesor.toString());
		}

	}

}
