
public class MaintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] d= {1,2,2,1};
		Polinomio p= new Polinomio(d.length-1,d);
		System.out.println(p.evaluarHorner(2));

	}

}
