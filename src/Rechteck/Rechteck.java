package Rechteck;

/**
 * 
 * @author stefanschwinghammer
 * @version 00.00.02
 */

public class Rechteck {
	private int a;
	private int b;

	public Rechteck(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public float berechneUmfang() {
		return 2 * b + 2 * a;
	}

	public float berechneInhalt() {
		return a * b;
	}

}
