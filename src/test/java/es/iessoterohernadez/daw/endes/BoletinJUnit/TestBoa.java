package es.iessoterohernadez.daw.endes.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestBoa {

	public Boa b;

	@BeforeEach
	public void init() {
		b = new Boa("Berta", 3, "Ratas");
	}

	@Test
	public void testHealthy() {

		assertFalse(b.isHealthy());
	}

	@Test
	public void testFitsCage() {

		assertTrue(b.fitsInCage(5));

	}
	
	@AfterEach
	public void finish() {
		b = null;
	}

}
