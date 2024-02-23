package es.iessoterohernadez.daw.endes.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.text.NumberFormat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAccount {

	private NumberFormat fmt = NumberFormat.getCurrencyInstance();
	public Account a;

	@BeforeEach
	public void init() {
		a = new Account("Pepe", 100, 200);
	}

	@Test
	public void testDeposit() {
		a.deposit(800);
		assertEquals(1000, a.getBalance());
	}

	@Test
	public void testWithdraw() {
		a.withdraw(100, 20);
		assertEquals(80, a.getBalance());
	}

	@Test
	public void testInvalidAmount() {
		assertFalse(a.withdraw(-10, 20));
	}

	@Test
	public void testInvalidFee() {
		assertFalse(a.withdraw(100, -20));
	}

	@Test
	public void testInvalidAmountBalance() {
		assertFalse(a.withdraw(300, 20));
	}

	@Test
	public void testInterest() {
		a.addInterest();
		assertEquals(209, a.getBalance());
	}

	@Test
	public void testToString() {
		/*getName() se ha creado para el toString*/
		
		String result = a.getAccountNumber() + "\t" + a.getName()+ "\t" + fmt.format(a.getBalance());
		assertEquals(result, a.toString());
	}
	
	/*EJERCICIO 7*/
	
	@Test
	public void badTestWithdraw() {
		/**/
		a.withdraw((float) 100.350560, 20);
		assertEquals(79.6494369506836, a.getBalance());
	}
	
	@AfterEach
	public void finish() {
		a = null;
	}

}
