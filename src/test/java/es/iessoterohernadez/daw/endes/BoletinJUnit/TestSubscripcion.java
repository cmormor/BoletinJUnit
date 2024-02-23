package es.iessoterohernadez.daw.endes.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestSubscripcion {
	
	@Test
	public void testPrecioMes() {
		
		Subscripcion sub = new Subscripcion(50,2);
		assertEquals(25,sub.precioPorMes());
		
	}
	
	@Test
	public void testCancel() {
		
		Subscripcion sub = new Subscripcion(50,2);
		sub.cancel();
		assertTrue(sub.precioPorMes() == 0);
		
	}

}
