package coloreo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ProbarColoreo {
	static int MATULA=2;
	static int SECUENCIALALEATORIO=0;
	static int WELSHPOWELL=1;
	
	
	private static int corridamenorSA=0,corridamenorWP=0,corridamenorMA=0,
			colorMenorMA= Integer.MAX_VALUE,colorMenorWP =Integer.MAX_VALUE,colorMenorSA = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		
		int corridas=100;
		ArrayList<ValorRepeticion> repeticionesSa=new ArrayList<ValorRepeticion>();
		ArrayList<ValorRepeticion> repeticionesMA=new ArrayList<ValorRepeticion>();
		ArrayList<ValorRepeticion> repeticionesWP=new ArrayList<ValorRepeticion>();
		//int corridamenorSA=0,corridamenorWP=0,corridamenorMA=0,
				//colorMenorMA= Integer.MAX_VALUE,colorMenorWP =Integer.MAX_VALUE,colorMenorSA = Integer.MAX_VALUE;
		
		String path="grafo_600_40.0.in";
		Colorear color = new Colorear(path);
		
		ProbarColoreo pruebaColoreo = new ProbarColoreo();
		
		pruebaColoreo.agregarArista(corridas, repeticionesMA, color, corridamenorMA,colorMenorMA,MATULA) ;
		System.out.println("corridas"+ pruebaColoreo.getCorridamenorMA()+" "+"  "+ pruebaColoreo.getColorMenorMA());
		pruebaColoreo.agregarArista(corridas, repeticionesWP, color, corridamenorWP,colorMenorWP,WELSHPOWELL) ;
		System.out.println("corridas"+ corridamenorWP+" "+"  "+colorMenorWP);
		pruebaColoreo.agregarArista(corridas, repeticionesSa, color, corridamenorSA,colorMenorSA,SECUENCIALALEATORIO) ;
		System.out.println("corridas"+ corridamenorSA+" "+"  "+colorMenorSA);

		
		//System.out.println("sale 3 for");
		color.escribirArchivo();
		escribirArchivoFrecuencias("frecuenciasSA.out", repeticionesSa);
		escribirArchivoFrecuencias("frecuenciasMA.out", repeticionesMA);
		escribirArchivoFrecuencias("frecuenciasWP.out", repeticionesWP);
	}

	private  void agregarArista(int corridas, ArrayList<ValorRepeticion> repeticiones, Colorear color,
			int  corridameno,int cantColoresMin,int algoritmo) {
		
		ValorRepeticion valor;
		for (int i = 0; i < corridas; i++) {
			if(repeticiones.isEmpty() ) {
				repeticiones.add( valor=new ValorRepeticion(color.AlgoritmosColoreo(algoritmo), 1));
			}
			else {
				
				valor=new ValorRepeticion(color.AlgoritmosColoreo(algoritmo), 1);
				if(repeticiones.isEmpty()==false &&  repeticiones.contains(valor)==true) {
					int indice=repeticiones.indexOf(valor);
					repeticiones.get(indice).setRepeticion(repeticiones.get(indice).getRepeticion()+1);
				}
				else
					repeticiones.add(valor);		
			}

			if(algoritmo==SECUENCIALALEATORIO) {
				if(i==0) {
					this.setCorridamenorSA(i);
					this.setColorMenorSA(valor.getValor());
				}
				if(this.getColorMenorSA()<valor.getValor()) {
					this.setCorridamenorSA(i);
					this.setColorMenorSA(valor.getValor());
				}
			}
			
			if(algoritmo==MATULA) {
				if(i==0) {
					this.setCorridamenorMA(i);
					this.setColorMenorMA(valor.getValor());
				}
				if(this.getColorMenorMA()<valor.getValor()) {
					this.setCorridamenorMA(i);
					this.setCorridamenorMA(valor.getValor());
				}
			}
			
			if(algoritmo==WELSHPOWELL) {
				if(i==0) {
					this.setCorridamenorWP(i);
					this.setColorMenorWP(valor.getValor());
				}
				if(this.getColorMenorWP()<valor.getValor()) {
					this.setCorridamenorWP(i);
					this.setCorridamenorWP(valor.getValor());
				}
			}
			
			
		}
			
//		this.setCorridamenorSA(999);
//		System.out.println("color menor"+this.getColorMenorSA());
//		this.setColorMenorSA(999);
		
	}
	
	private static void escribirArchivoFrecuencias(String path, ArrayList<ValorRepeticion>lista) {
		FileWriter fw = null;
		PrintWriter pw =  null;
		try {
			fw = new FileWriter(path);
			pw = new PrintWriter(fw);
			/*
			for (int i = 0; i < frecuencias.length; i++) {
				if(frecuencias[i]!= 0)
					pw.println((i+1) + " " + frecuencias[i]);
			}
			*/
			for (int i = 0; i < lista.size(); i++) 
					pw.println(lista.get(i).getValor() + " " + lista.get(i).getRepeticion());
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

	public int getCorridamenorSA() {
		return corridamenorSA;
	}

	public void setCorridamenorSA(int corridamenorSA) {
		this.corridamenorSA = corridamenorSA;
	}

	public int getCorridamenorWP() {
		return corridamenorWP;
	}

	public void setCorridamenorWP(int corridamenorWP) {
		this.corridamenorWP = corridamenorWP;
	}

	public int getCorridamenorMA() {
		return corridamenorMA;
	}

	public void setCorridamenorMA(int corridamenorMA) {
		this.corridamenorMA = corridamenorMA;
	}

	public int getColorMenorMA() {
		return colorMenorMA;
	}

	public void setColorMenorMA(int colorMenorMA) {
		this.colorMenorMA = colorMenorMA;
	}

	public int getColorMenorWP() {
		return colorMenorWP;
	}

	public void setColorMenorWP(int colorMenorWP) {
		this.colorMenorWP = colorMenorWP;
	}

	public int getColorMenorSA() {
		return colorMenorSA;
	}

	public void setColorMenorSA(int colorMenorSA) {
		this.colorMenorSA = colorMenorSA;
	}
	
	
	
	
	
	

}

	class ValorRepeticion{
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + repeticion;
			result = prime * result + cantidadColores;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			//System.out.println("Entro a equlas");
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
		
			ValorRepeticion other = (ValorRepeticion) obj;
			if (cantidadColores != other.cantidadColores)
				return false;
			return true;
		}

		private int cantidadColores, repeticion;
		 
		ValorRepeticion(int valor,int repe){
			this.cantidadColores=valor;
			this.repeticion=repe;
		}

		public int getValor() {
			return cantidadColores;
		}

		public void setValor(int valor) {
			this.cantidadColores = valor;
		}

		public int getRepeticion() {
			return repeticion;
		}

		public void setRepeticion(int repeticion) {
			this.repeticion = repeticion;
		}
		
	}
