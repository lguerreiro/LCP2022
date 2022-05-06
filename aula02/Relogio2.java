package java001;

public class Relogio2 {

	int hora, minuto, segundo;
	public Relogio2(int h, int m, int s){
		this.hora = h;
		this.minuto = m;
		this.segundo = s;
	}
	public Relogio2(int h, int m){
		this(h, m, 0);
	}
	public Relogio2(int h){
		this(h, 0, 0);
	}
	@Override
	public String toString(){
		return this.hora + ":" + this.minuto + ":" + this.segundo;
	}
	public static void main(String[] args){
		Relogio2 r1 = new Relogio2(20, 15, 10);
		Relogio2 r2 = new Relogio2(20, 10);
		Relogio2 r3 = new Relogio2(19);
		System.out.println("Hora r1 = " + r1);
		System.out.println("Hora r2 = " + r2);
		System.out.println("Hora r3 = " + r3);
	}

}


