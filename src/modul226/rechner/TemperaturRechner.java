package modul226.rechner;

/**
 * Diese Klasse übernimmt die Temperatur rechnungen
 * @author stefanschwinghammer
 * @version 00.00.01
 * 
 */
public class TemperaturRechner {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TemperaturRechner rechner = new TemperaturRechner();
		System.out.println(rechner.convert(37.5));

	}
	/** 
	 * Um den Test zu faillen das + bei 32 auf - setzten und test wiederholen 
	 * @param celsuis
	 * @return
	 */
	public double convert(double celsuis) {
		double ergebnis = (celsuis * 9 / 5) + 32;
		return ergebnis;
	}
	
}