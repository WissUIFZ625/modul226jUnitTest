package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import modul226.rechner.TemperaturRechner;

public class Rechnertest {

	/**
	 * jUnit test 
	 */
	@Test
	public void testConvert() {
		TemperaturRechner rechner = new TemperaturRechner();
		double ergebnis = rechner.convert(37.5);
		assertEquals(99.5, ergebnis, 0.0001);
	}

}
