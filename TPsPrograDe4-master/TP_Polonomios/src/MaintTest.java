
public class MaintTest {

	public static void main(String[] args) {
		int grado = 2000;
		long start, end;
		int X = 37;
		double[] d = new double [grado];
		for (int i = 0; i < grado; i++) {
			d[i] = Math.random()*10;
		}
		System.out.println("**********************EVALUAR MULTIPLICACIONES SUCESIVAS********************");
		Polinomio p1= new Polinomio(grado,d);
		start=System.nanoTime();
		System.out.println("resultado: " + p1.evaluarMSucesivas(X));
		end=System.nanoTime();
		System.out.println("tiempo en milisegundos:"+(end-start));		

		System.out.println("**********************EVALUAR RECURSIVA********************");
		Polinomio p2= new Polinomio(grado-1,d);
		start=System.nanoTime();
		System.out.println("resultado: " + p2.evaluarRecursiva(X));
		end=System.nanoTime();
		System.out.println("tiempo en milisegundos:"+(end-start));		
		
		System.out.println("**********************EVALUAR RECURSIVA PAR********************");
		Polinomio p3= new Polinomio(grado-1,d);
		start=System.nanoTime();
		System.out.println("resultado: " + p3.evaluarRecursiva(X));
		end=System.nanoTime();
		System.out.println("tiempo en milisegundos:"+(end-start));	
		
		System.out.println("**********************EVALUAR PROGRAMACION DINAMICA********************");
		Polinomio p4= new Polinomio(grado-1,d);
		start=System.nanoTime();
		System.out.println("resultado: " + p4.EvaluaProgDinamica(X));
		end=System.nanoTime();
		System.out.println("tiempo en milisegundos:"+(end-start));	
		
		System.out.println("**********************EVALUAR MEJORADA********************");
		Polinomio p5= new Polinomio(grado-1,d);
		start=System.nanoTime();
		System.out.println("resultado: " + p5.EvaluaMejorada(X));
		end=System.nanoTime();
		System.out.println("tiempo en milisegundos:"+(end-start));	
		
		System.out.println("**********************EVALUAR POW********************");
		Polinomio p6= new Polinomio(grado-1,d);
		start=System.nanoTime();
		System.out.println("resultado: " + p6.evaluarRecursiva(X));
		end=System.nanoTime();
		System.out.println("tiempo en milisegundos:"+(end-start));		

		System.out.println("**********************EVALUAR HORNER********************");
		Polinomio p7= new Polinomio(grado-1,d);
		start=System.nanoTime();
		System.out.println("resultado: " + p7.evaluarHorner(X));
		end=System.nanoTime();
		System.out.println("tiempo en milisegundos:"+(end-start));
	}
}
