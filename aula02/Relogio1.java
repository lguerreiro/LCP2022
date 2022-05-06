package java001;

public class Relogio1 {

	int hora, minuto, segundo;
	
	public Relogio1(int h, int m, int s){
		this.hora = h;
		this.minuto = m;
		this.segundo = s;
	}
	
	public Relogio1(int h, int m){
		this.hora = h;
		this.minuto = m;
		this.segundo = 0;
	}
	
	public Relogio1(int h){
		this.hora = h;
		this.minuto = 0;
		this.segundo = 0;
	}
	
	public String getHorario(){
		return this.hora + ":" + this.minuto + ":" + this.segundo;
	}
	
	public static void main(String[] args){
		Relogio1 r1 = new Relogio1(20, 15, 10);
		Relogio1 r2 = new Relogio1(20, 10);
		Relogio1 r3 = new Relogio1(19);
		System.out.println(r1.getHorario());
		System.out.println(r2.getHorario());
		System.out.println(r3.getHorario());
	}
}


