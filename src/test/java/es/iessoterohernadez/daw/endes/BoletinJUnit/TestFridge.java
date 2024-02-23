package es.iessoterohernadez.daw.endes.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFridge {

	public Fridge f;

	@BeforeEach
	public void init() {
		f = new Fridge();
	}

	@Test
	public void testPut() {
		f.put("huevos");
		assertTrue(f.contains("huevos"));
	}

	@Test
	public void testTake() throws NoSuchItemException {
		f.put("huevos");
		f.take("huevos");
		assertFalse(f.contains("huevos"));
	}

	@AfterEach
	public void finish() {
		f = null;
	}

}
