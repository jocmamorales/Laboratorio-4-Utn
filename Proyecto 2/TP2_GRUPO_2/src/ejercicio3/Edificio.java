package ejercicio3;

public abstract class Edificio {

	private double superficie = 0;

	public Edificio(double superficie) {
		if (superficie > 0)
			this.superficie = superficie;
	}

	public double getSuperficieEdificio() {
		return this.superficie;
	}
	
	public String toString() {
		return "Edificio con superficie de " + this.superficie;
	}

}
