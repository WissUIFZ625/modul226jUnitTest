package testing;
/**
 * @Autor Stefan Schwinghammer
 * @Version 00.00.01
 * @Date 26.3.2017
 * 
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Rechteck.Rechteck;

public class RechteckTest {

	private static Rechteck myRechteck;
/**
 * Erstellt ein Testobjkekt mit den Werten 10, 20
 */
	@BeforeClass
	public static void create() {
		myRechteck = new Rechteck(10, 20);
		System.out.println("Start");
	}
	@Before
	public void vor() {
		// Diese Methode wird vor jedem Testfall ausgeführt
		System.out.println("wird vor dem Test ausgefürt");
	}
	@Test
	public void testFläche(){
		// Testfall 2: Prüfung ob Flächeninhaltsberechnung stimmt
	      Assert.assertNotNull((myRechteck.berechneInhalt()));
	      System.out.println("Test Fläche");
	}
	@Test
	public void testBerechneUmfang() {
		// Testfall 1: Prüfung ob Umfangsberechnung stimmt
		Assert.assertTrue(60 == myRechteck.berechneUmfang());
		System.out.println("TestUmfang");
	}
	@After
	public void danach(){
		// Diese Methode wird nach jedem Testfall ausgeführt z.B. um einen bestimmter
		System.out.println("Nach dem Test");
	}
	@AfterClass
	public static void delete(){
		// Diese Methode wird am Ende der Test-Klasse ausgeführt 
		//z.B. zum aufräumen oder 
		// löschen von Rückständen
		System.out.println("Test endet hier");
	}
}
