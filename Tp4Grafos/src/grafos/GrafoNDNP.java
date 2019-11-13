package grafos;

import grafos.MatrizSimetrica;

public class GrafoNDNP extends MatrizSimetrica{
	
	private int gradoMin;
	private int gradoMax;
	private int cantArista;
	private double porcentajeAdy;
	
	public GrafoNDNP(int nodos, int gradoMin, int gradoMax, int cantArista,
			double porcentajeAdy) {
		super(nodos);
		this.gradoMin = gradoMin;
		this.gradoMax = gradoMax;
		this.cantArista = cantArista;
		this.porcentajeAdy = porcentajeAdy;
	}

	public void setArista(int f, int c){
		this.vector[getIndice(f, c)] = 1;
	}
		
	public int getCantNodos() {
		return nodos;
	}
	
	public int cantidadAristas() {
		int aristas = 0;
		int maxAristas = nodos*(nodos - 1)/2;
		for(int i = 0; i < maxAristas; i++)
			if(this.vector[i] == 1)
				aristas++;
		return aristas;
	}
	
	public int getNodos() {
		return nodos;
	}

	public void setNodos(int nodos) {
		this.nodos = nodos;
	}

	public int getGradoMin() {
		return gradoMin;
	}

	public void setGradoMin(int gradoMin) {
		this.gradoMin = gradoMin;
	}

	public int getGradoMax() {
		return gradoMax;
	}

	public void setGradoMax(int gradoMax) {
		this.gradoMax = gradoMax;
	}

	public int getCantArista() {
		return cantArista;
	}

	public void setCantArista(int cantArista) {
		this.cantArista = cantArista;
	}

	public double getPorcentajeAdy() {
		return porcentajeAdy;
	}

	public void setPorcentajeAdy(double porcentajeAdy) {
		this.porcentajeAdy = porcentajeAdy;
	}

	public int getMaxAristas() {
		return nodos*(nodos - 1)/2;
	}
	
	public int getGrado(int nodo) {
		int grado = 0;
		for(int i = 0; i < nodos; i++) {
			if(nodo != i && vector[getIndice(nodo, i)] == 1)
				grado++;
		}	
		return grado;
	}
}
