package tests_examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import ejercicio_examen.EjercicioJunit;

class Tests_Examen {
	static int a;
	static int b;
	EjercicioJunit e = new EjercicioJunit();
	
	@BeforeAll
	static void BeforeAll() throws Exception {
		System.out.println("Comienzan los tests...");
	}

	@BeforeEach
	void BeforeEach() throws Exception {
		a = 100;
		b = 20;
		e.setA(a);
		e.setB(b);
	}
	
	@AfterAll
	static void AfterAll() throws Exception {
		System.out.println("Finalizan los tests...");
	}
	
	@Test
	void testSuma() {
		assertEquals(120, e.sumar());
	}
	
	@Test
	void testResta() {
		assertEquals(80, e.restar());
	}
	
	@Test
	void testDivisio() {
		assertEquals(5, e.dividir());
	}
	
	@Test
	void testMult() {
		assertEquals(2000, e.multiplicar());
	}
	
}
