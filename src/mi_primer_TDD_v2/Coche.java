package mi_primer_TDD_v2;

public class Coche {

	public int velocidad;
	
	public void acelerar(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar(int deceleracion) {
        velocidad -= deceleracion;
    }
}
