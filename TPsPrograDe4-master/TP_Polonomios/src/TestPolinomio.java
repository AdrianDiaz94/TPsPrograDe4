
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestPolinomio {
	
	@Test
	public void test_MSucesivas() {
		int grado = 3;
		double [] d2= {1,2,3,6};
		Polinomio p1= new Polinomio(grado,d2);
		Assert.assertEquals(p1.evaluarMSucesivas(2),28.0,0.01);
	}
	
	@Test
	public void test_Recursiva() {
		int grado = 3;
		double [] d2= {1,2,3,6};
		Polinomio p1= new Polinomio(grado,d2);
		Assert.assertEquals(p1.evaluarRecursiva(2),28.0,0.01);
	}
	
	@Test
	public void test_RecursivaPar() {
		int grado = 3;
		double [] d2= {1,2,3,6};
		Polinomio p1= new Polinomio(grado,d2);
		Assert.assertEquals(p1.evaluarRecursivaPar(2),28.0,0.01);
	}
	
	@Test
	public void test_Horner() {
		int grado = 3;
		double [] d2= {1,2,3,6};
		Polinomio p1= new Polinomio(grado,d2);
		Assert.assertEquals(p1.evaluarHorner(2),28.0,0.01);
	}
	
	@Test
	public void test_ProgDinamica() {
		int grado = 3;
		double [] d2= {1,2,3,6};
		Polinomio p1= new Polinomio(grado,d2);
		Assert.assertEquals(p1.evaluaProgDinamica(2),28.0,0.01);
	}
	
	@Test
	public void test_DinamicaMejorada() {
		int grado = 3;
		double [] d2= {1,2,3,6};
		Polinomio p1= new Polinomio(grado,d2);
		Assert.assertEquals(p1.evaluaMejorada(2),28.0,0.01);
	}
	
	/******Polinomio Con Binomio de Newton con triangulo de tartaglia*******/
	@Test
	public void polinomioConBinomioDeNewton1() {
		BinomioDeNewton binomio = new BinomioDeNewton(1, 2, 2);
		Polinomio p = binomio.formaPolinomicaConTartaglia();
		Assert.assertEquals(p.evaluarMSucesivas(2),16.0,0.01);
	}

	/******Polinomio Con Binomio de Newton con combinatoria*******/
	@Test
	public void polinomioConBinomioDeNewton2() {
		BinomioDeNewton binomio = new BinomioDeNewton(1, 2, 2);
		Polinomio p = binomio.formaPolinomica();
		Assert.assertEquals(p.evaluarMSucesivas(2),16.0,0.01);
	}
}
