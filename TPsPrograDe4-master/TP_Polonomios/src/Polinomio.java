
public class Polinomio {
	private int grado ; 
	private double [] coeficientes ; 

	public Polinomio(int grado,double [] coef) {
	this.grado=grado;
	this.coeficientes=coef;
	}

	/****Polinomio con algoritmo de Multiplicaciones sucesivas****/
	public double evaluarMSucesivas (double x) {
		double suma = 0;
		double num = 0;
		for (int i = 0; i < coeficientes.length; i++) {
			for (int j = i; j < coeficientes.length; j++) {
				num = coeficientes[i]*= x;
			}
			suma += num;
		}
		return suma;
	}
	
/******Polinomio con recursividad*****/
	double evaluarRecursiva (double x) {
		double resultado= 0;
		for(int i=0;i<=this.grado;i++)
			resultado+=this.coeficientes[i]* potencia(x,this.grado-i);
		return resultado;
	}
	
	
	double potencia(double x,int n ) {
		if(n==0)
			return 1;
		return x*potencia(x,n-1);
			
	}
	/****Polinomio con recursividad que dif par y impar****/
	double evaluarRecursivaPar (double x) {
		double resultado=0;
		for(int i=0;i<=this.grado;i++)
			resultado+=this.coeficientes[i]* potencia2(x,this.grado-i);
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
		//Bn=An
		//B(n-1)=An-1+Bn*Xo
		double resultado=this.coeficientes[0];
		for(int i=1;i<=this.grado;i++)
		resultado=this.coeficientes[i]+resultado*x;
		return resultado;
	}
	
	/*****Polinomio con Programacion dinamica******/	
	public double evaluaProgDinamica (double x){
    		int n=this.grado;
    		double suma=0;
    		double pot=1;
    		for(int i=n;i>=0;i--){
        		suma+=this.coeficientes[i]*pot;
        		pot*=x;
    		}
    		return suma;
	}
	/*****Polinomio con evaluarMejorada******/
 	public double evaluaMejorada (double x){
        	int n=this.grado;
        	double pot=x;
        	double suma=this.coeficientes[n]+(this.coeficientes[n-1]*pot);
        	for(int i=n-2;i>=0;i--){
            		pot*=x;
            		suma+=this.coeficientes[i]*pot;
        	}
        	return suma;
 	}
 	
	/****Polinomio con algoritmo de POW****/
	public double evaluarPow(double x) {
		double suma = 0;
		double num = 0;
		for (int i = 0; i < coeficientes.length; i++) {
			num = coeficientes[i] * Math.pow(x, this.grado-i);
			suma += num;
		} 
		return suma;
	} 
}
