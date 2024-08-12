package lista2_ex1;

public class Recursividade1Ctrl {
	public Recursividade1Ctrl() {
		super();
	}
	
	public int calcular(int a, int b) {
		if(b == 0) {
			return 0;
		} else {
			
			return a + calcular(a, b - 1);
		}
	}
}
