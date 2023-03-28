package mi_primer_TDD_v2;

public class Coche {

	public int velocidad;
	
	public void acelerar_ALEJANDRO_VICENTE(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar_ALEJANDRO_VICENTE(int deceleracion) {
        velocidad -= deceleracion;
        if(velocidad<0) velocidad=0;
    }
}
