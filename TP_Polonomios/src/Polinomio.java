
public class Polinomio {
	private int grado ; 
	private double [] coeficientes ; 

	public Polinomio(int grado,double [] coef) {
	this.grado=grado;
	this.coeficientes=coef;
	}
/******Polinomio con recursividad*****/


	double evaluarRecursiva (double x) {
		double resultado= 0;
		long start=System.currentTimeMillis();
		for(int i=0;i<=this.grado;i++)
			resultado+=this.coeficientes[i]* potencia(x,this.grado-i);
		long end=System.currentTimeMillis();
		System.out.println(start);
		System.out.println(end);
		System.out.println("tiempo:"+(end-start));
		return resultado;
	}
	
	
	double potencia(double x,int n ) {
		if(n==0)
			return 1;
		return x*potencia(x,n-1);
			
		/****Polinomio con recursividad que dif par y impar****/
	}
	double evaluarRecursivaPar (double x) {
	long start = System.currentTimeMillis();
		double resultado=0;
		for(int i=0;i<=this.grado;i++)
			resultado+=this.coeficientes[i]* potencia2(x,this.grado-i);
		long end = System.currentTimeMillis();
		System.out.println(start);
		System.out.println(end);
		System.out.println("tiempo:"+(end-start));
		return resultado;
		
	}
	double potencia2(double x,int n ) {
		if(n==0)
			return 1;
		if(n%2==0)
			return potencia2(x*x,n/2);
		return x*potencia2(x,n-1);
			
	}
	/****Polinomio con algoritmo de Horner****/
	double evaluarHorner( double x) {
		long start=System.currentTimeMillis();
		
		//Bn=An
		//B(n-1)=An-1+Bn*Xo
		double resultado=this.coeficientes[0];
		for(int i=1;i<=this.grado;i++)
		resultado=this.coeficientes[i]+resultado*x;
		long end=System.currentTimeMillis();
		System.out.println("start:"+start);
		System.out.println("end:"+end);
		System.out.println("tiempo:"+(end-start));
		return resultado;
	}
	
	/*****Polinomio con Programacion dinamica******/	
	public double EvaluaProgDinamica (double x){
    		int n=this.grado;
    		double suma=0;
    		double pot=1;
    		for(int i=n;i>=0;i++){
        		suma+=this.coeficientes[i]*pot;
        		pot*=x;
    		}
    		return suma;
	}

 	public double EvaluaMejorada (double x){
        	int n=this.grado;
        	double pot=x;
        	double suma=this.coeficientes[n]+(this.coeficientes[n-1]*pot);
        	for(int i=n-2;i>=0;i++){
            		pot*=x;
            		suma+=this.coeficientes[i]*pot;
        	}
        	return suma;
 	}
 
}
