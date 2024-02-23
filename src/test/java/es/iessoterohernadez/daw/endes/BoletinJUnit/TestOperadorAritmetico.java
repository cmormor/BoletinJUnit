package es.iessoterohernadez.daw.endes.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestOperadorAritmetico {

	@Test
	public void testSuma() {

		OperadorAritmetico op = new OperadorAritmetico();
		assertEquals(50, op.suma(30, 20));

	}
	
	@Test
	public void testDivision() throws Exception {
		
		OperadorAritmetico op = new OperadorAritmetico();
		assertEquals(25, op.division(50, 2));
		
	}

}
