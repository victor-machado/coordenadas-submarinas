package br.com.coordenadas.bussiness;

import org.junit.Test;

import br.com.coordenadas.business.CoordenadasBO;
import junit.framework.TestCase;

public class CoordenadasBOTest extends TestCase {
	CoordenadasBO bo = new CoordenadasBO();
	
	@Test
    public void testCoordenadas1(){
        String coordenadasTeste1 = "-1 2 0 NORTE";
        assertEquals(coordenadasTeste1, bo.calcularCoordenada("LMRDDMMUU"));
    }
	
	@Test
    public void testCoordenadas2(){
        String coordenadasTeste2 = "2 3 -2 SUL";
        assertEquals(coordenadasTeste2, bo.calcularCoordenada("RMMLMMMDDLL"));
    }
}
