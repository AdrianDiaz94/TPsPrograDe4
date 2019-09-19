
public class MaintTest {

	public static void main(String[] args) {
		int grado =2000;
		long start, end;
		int X = 3;
	double[] d = new double [grado+1];
		for (int i = 0; i < grado+1; i++) {
		d[i] = Math.random()*10;
		}
	
		Polinomio p1= new Polinomio(grado,d);
		System.out.println("**********************EVALUAR MULTIPLICACIONES SUCESIVAS********************");
		start=System.nanoTime();
	    System.out.println("resultado: " + p1.evaluarMSucesivas(X));
		end=System.nanoTime();
		System.out.println("tiempo en nanosegundos:"+(end-start));		

		System.out.println("**********************EVALUAR RECURSIVA********************");
		start=System.nanoTime();
		System.out.println("resultado: " + p1.evaluarRecursiva(X));
		end=System.nanoTime();
		System.out.println("tiempo en nanosegundos:"+(end-start));		
		
		System.out.println("**********************EVALUAR RECURSIVA PAR********************");
		start=System.nanoTime();
		System.out.println("resultado: " + p1.evaluarRecursiva(X));
		end=System.nanoTime();
		System.out.println("tiempo en nanosegundos:"+(end-start));	
		
		System.out.println("**********************EVALUAR PROGRAMACION DINAMICA********************");
		start=System.nanoTime();
		System.out.println("resultado: " + p1.evaluaProgDinamica(X));
		end=System.nanoTime();
		System.out.println("tiempo en nanosegundos:"+(end-start));	
		
		System.out.println("**********************EVALUAR MEJORADA********************");
		start=System.nanoTime();
		System.out.println("resultado: " + p1.evaluaMejorada(X));
		end=System.nanoTime();
		System.out.println("tiempo en nanosegundos:"+(end-start));		
		
		System.out.println("**********************EVALUAR POW********************");
		start=System.nanoTime();
	    System.out.println("resultado: " + p1.evaluarRecursiva(X));
		end=System.nanoTime();
		System.out.println("tiempo en nanosegundos:"+(end-start));			

		System.out.println("**********************EVALUAR HORNER********************");
		start=System.nanoTime();
		System.out.println("resultado: " + p1.evaluarHorner(X));
		end=System.nanoTime();
		System.out.println("tiempo en nanosegundos:"+(end-start));	
		

	}
}
