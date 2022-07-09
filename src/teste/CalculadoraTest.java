package teste;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import matematica.Calculadora;
public class CalculadoraTest{
	@BeforeClass
	public static void setUpClass() throws Exception{
		
	}
	@AfterClass
	public static void tearDownClass() throws Exception{
		
	}
	@Before
	public void setUp() {
		
	}
	@After
	public void tearDown() {
		
	}
	@Test public void testSomar() {
		System.out.println("somar");
		int n1=5;
		int n2=5;
		Calculadora instance =new Calculadora();
		double expResult =10.0;
		double result = instance.somar(n1, n2);
		assertEquals(expResult, result, 0);
	}
	@Test public void testSubtrair() {
		
		System.out.println("subtrair");
		int n1=5;
		int n2=3;
		Calculadora instance =new Calculadora();
		double expResult = 2;
		double result = instance.subtrair(n1, n2);
		assertEquals(expResult, result,0);		
	}
	@Test public void testMultiplicar() {
		System.out.println("multiplicar");
		int n1=2;
		int n2=3;
		Calculadora instance =new Calculadora();
		double expResult = 6;
		double result = instance.multiplicar(n1, n2);
		assertEquals(expResult, result,0);	
	}
	@Test public void testDividir() {
		System.out.println("dividir");
		int n1=6;
		int n2=3;
		Calculadora instance =new Calculadora();
		double expResult = 2;
		double result = instance.dividir(n1, n2);
		assertEquals(expResult, result,0);	
	}
}