package java001;

public class SegundoGrau {

	int a;
	int b;
	int c;
	
	double x1, x2;
	
	public SegundoGrau(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean calculaEquacao() {
		double delta = (this.b * this.b) -4 * this.a * this.c ;
		if (delta < 0) {
			return false;
		} else {
			this.x1 = (-this.b + Math.sqrt(delta)) / (2 * this.a);
			this.x2 = (-this.b - Math.sqrt(delta)) / (2 * this.a);
			return true;
		}
	}
	
	public double getX1() {
		return this.x1;
	}
	
	public double getX2() {
		return this.x2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SegundoGrau equacao = new SegundoGrau(1, -5, 6);
		boolean resultado = equacao.calculaEquacao();
		if (resultado) {
			System.out.printf("x1 = %.2f, x2 = %.2f", equacao.getX1(), equacao.getX2());
		} else {
			System.out.println("Sem raizes reais");
		}

	}

}
