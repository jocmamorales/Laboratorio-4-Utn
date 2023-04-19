package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Empleado[] emps = new Empleado[5];
		emps[0] = new Empleado();
		emps[1] = new Empleado("Juana", 23);
		emps[2] = new Empleado("Carlos", 26);
		emps[3] = new Empleado();
		emps[4] = new Empleado("Julieta", 21);
	
		for (Empleado e : emps) {
			System.out.println(e.toString());			
		}

		System.out.println("\nEl id del proximo empleado sera " + Empleado.devuelveProximoID());
	}
}


