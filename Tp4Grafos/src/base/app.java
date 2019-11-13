package base;

import java.io.IOException;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import coloreo.Colorear;
import coloreo.NodoColor;

public class app {

	public static void main(String[] args) throws IOException {
	
	/**
	 * Prueba de Generadores	
	 */
		Probabilidad GeneradorPorb = new Probabilidad(5,50);//Generador de grafos aleatorios dados N y una probabilidad para cada arista.
		GeneradorPorb.generar();
//		
//		PorcentajeAris GeneradorPA= new PorcentajeAris(5, 0);//Generador de grafos aleatorios dados N y el porcentaje de adyacencia		
//		GeneradorPA.generar();
//		
//		Regular GeneradorReg=new Regular(8, 7);//Generador de grafos regulares dados N y el grado.
//		GeneradorReg.generar();
//		
//		RegularAdyacente GeneradorRegAdy=new RegularAdyacente(1000, 50);//Generador de grafos regulares dados N y el porcentaje de adyacencia.
//		GeneradorRegAdy.generar();
//		
//	NPartitos GeneradorNParti =  new NPartitos(10, 3);//Generador de grafos n-partitos, dados N y n.
//		GeneradorNParti.generar();
/**
 * COLOREO DE GRAFOS DADO UN ARCHIVO.IN		
 */

//		Colorear colorear= new Colorear("grafo_5_5.in");
//		System.out.println("cantidad de colores: " + colorear.AlgoritmosColoreo(0));
//		for (NodoColor nodoColor : colorear.getOrdenMejorCasoSA()) {
//			System.out.println("nodo: " + nodoColor.getNodo() + " color: " + nodoColor.getColor());
//		}
		
/**
 * PUNTO 2b) Generar grafos aleatorios de 40, 60 y 90 % de Ady		
 */
//		PorcentajeAris GeneradorPA40=new PorcentajeAris(600, 40);
//		GeneradorPA40.generar();
//		PorcentajeAris GeneradorPA60=new PorcentajeAris(600, 60);
//		GeneradorPA60.generar();
//		PorcentajeAris GeneradorPA90=new PorcentajeAris(600, 90);
//		GeneradorPA90.generar();

/**
 * PUNTO 2b) Generar grafos regulares de 50 y 75 % de Ady		
 */		
//		RegularAdyacente GeneradorRA50 =  new RegularAdyacente(1000, 50);
//		GeneradorRA50.generar();
//		RegularAdyacente GeneradorRA75 =  new RegularAdyacente(1000, 75);
//		GeneradorRA75.generar();
		
/**
 * Programa probador de los algoritmos de coloreo.
 */
	//	if (Probador.programaProbador("grafo_600_40.0.in","secuencialAleatorio.out") == true) 
	//		System.out.println("joya");
	//	else
	//		System.out.println("todo mal");
	}	
}
