package es.iessoterohernadez.daw.endes.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPila {

	private Pila p;

	@BeforeEach
	public void init() {
		p = new Pila();
	}
	
	@Test
	public void testPush() {
		
		p.push(5);
		assertTrue(p.isEmpty() == false);
		
	}
	
	@Test
	public void testPop() {
		p.pop();
		assertTrue(p.isEmpty() == true);
		
	}
	
	@Test
	public void testTop() {
		p.push(5);
		p.push(4);
		assertTrue(p.top() == 4);
		assertFalse(p.top() == 5);
	}
	
	@AfterEach
		public void finish() { 
		p = null;
		
	}
	

}
