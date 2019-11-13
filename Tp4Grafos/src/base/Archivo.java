package base;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class Archivo {
	private int nodos ,CA ,GrMax, GrMin;
	private double PorcentajeAd;
	 ArrayList<Arista>aristas = new ArrayList<Arista>();

	public Archivo(int n, int cA, double porcentajeAd, int grMax, int grMin, ArrayList<Arista>aristas) {
		nodos = n;
		CA = cA;
		PorcentajeAd = porcentajeAd;
		GrMax = grMax;
		GrMin = grMin;
		this.aristas = aristas;
	}

	 void escribir() throws IOException {
	 
		 	FileWriter fw = null;
			PrintWriter pw =  null;
			try {
				fw = new FileWriter("grafo_" + nodos + "_" + PorcentajeAd +".in");
				pw = new PrintWriter(fw);
				pw.println(nodos+" "+CA+" " +PorcentajeAd+" "+GrMax+" "+GrMin);
				Iterator<Arista> it = aristas.iterator();
				while(it.hasNext()){
					Arista elemento = it.next();
					pw.println(elemento.nodoOrigen+" "+elemento.nodoDestino);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(fw!= null)
						fw.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}	
	}
}
