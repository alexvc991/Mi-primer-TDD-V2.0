package mi_primer_TDD_v2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCoche {

	@Test
	public void test_al_crear_un_coche_su_velocidad_es_cero_ALEJANDRO_VICENTE() {
		Coche nuevoCoche = new Coche();
		Assertions.assertEquals(0, nuevoCoche.velocidad);
	}
	@Test
    public void test_al_acelerar_un_coche_su_velocidad_aumenta_ALEJANDRO_VICENTE() {
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar_ALEJANDRO_VICENTE(30);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }
	@Test
	    public void test_al_decelerar_un_coche_su_velocidad_disminuye_ALEJANDRO_VICENTE() {
	        Coche nuevoCoche = new Coche();
	        nuevoCoche.velocidad = 50;
	        nuevoCoche.decelerar_ALEJANDRO_VICENTE(20);
	        Assertions.assertEquals(30, nuevoCoche.velocidad);
	}
	@Test
    public void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_que_cero_ALEJANDRO_VICENTE() {
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar_ALEJANDRO_VICENTE(80);
        Assertions.assertEquals(0, nuevoCoche.velocidad);
}
	
	
}
