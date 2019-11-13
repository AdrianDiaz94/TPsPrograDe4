package base;

import java.io.IOException;

public class RegularAdyacente extends Generador {

	
	public RegularAdyacente(int nodos, double porcentajeAdyacencia) {
		super(nodos, porcentajeAdyacencia);
	}
	
	@Override
	public void generar() throws IOException {
		int grado=(int)((porcentajeAdyacencia/100)*nodos-1);
		double aux=grado-(int)grado;
		if(aux>=0.5)
			grado++;
		Regular reg=new Regular(nodos, grado);
		reg.generar();

	}
}
