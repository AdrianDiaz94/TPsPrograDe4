package base;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import grafos.GrafoNDNP;

public class Probador {
	
	public static boolean programaProbador(String pathGrafo,String pathColoreado) throws IOException{
		
		GrafoNDNP grafo = Generador.leer(pathGrafo);
		
		Scanner sc = new Scanner(new File(pathColoreado));
		sc.useLocale(Locale.ENGLISH);
		
		int cantNodos = sc.nextInt();
		int cantColoresUsados = sc.nextInt();
		int cantAristas = sc.nextInt();
		double porcAdy = sc.nextDouble();
		int grMax = sc.nextInt();
		int grMin = sc.nextInt();
	
		int[] listaColoreados = new int [cantNodos];
		
		for(int i=0;i<cantNodos;i++) 
			listaColoreados[sc.nextInt()]=sc.nextInt();
		
		sc.close();
		//verifico coincidencias entre el .in y el .out
		if(grafo.getCantNodos()!=cantNodos)
			return false;
		if(grafo.getCantArista()!=cantAristas)
			return false;
		if(grafo.getPorcentajeAdy()!=porcAdy)
			return false;
		if(grafo.getGradoMax()!=grMax)
			return false;
		if(grafo.getGradoMin()!=grMin)
			return false;
	
		//Se verifica que los pares de nodos adyacentes no sean del mismo color
		for(int i=0; i<cantNodos-1;i++) 
			for (int j = i+1; j < cantNodos; j++) {
				
				if(grafo.getValor(i, j) == 1)
					if(listaColoreados[i]==listaColoreados[j])
				           return false;
			}
		
		//Verifico que la cantidad de colores usados no sea mayor a la cantidad de nodos
		if(cantColoresUsados > cantNodos || cantColoresUsados <= 0)
             return false;
       //Verifico que no hayan quedado nodos sin colorear      
		for(int j=0 ;j<cantNodos;j++)
		if (listaColoreados[j] == 0) 
			return false;
		
		
		return true;
	}

}
