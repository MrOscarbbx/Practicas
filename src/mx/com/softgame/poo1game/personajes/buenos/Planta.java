package mx.com.softgame.poo1game.personajes.buenos;
import mx.com.softgame.poo1game.personajes.Personaje;

public class Planta extends Personaje{

	private char escudo;

	public Planta(String nombre, int vida, char escudo){
		super(nombre,vida);
		this.escudo=escudo;
	}
	public Planta(String nombre, char escudo){
		super(nombre,3);
		this.escudo=escudo;
	}
	public Planta(String nombre, int vida){
		super(nombre,vida);
		this.escudo='A';
	}
	public Planta(String nombre){
		super(nombre,3);
		this.escudo='A';
	}

	public String getDetalle(){
		return (nombre+"\t"+vida+"\t"+escudo);
	}

	public void decVida(){
		if (vida!=0 && vida>0 && escudo!='A'){
			vida -= 1;
		}else {
			vida-= 2;
		}
	}
	public void decVida(int x){
		if ((vida!=0 && vida>0) && ((vida-x)>=0) && escudo!='A') {
			vida -= x;
		}else {
			vida-=2;
		}
	
	}

	public char getEscudo(){
		return escudo;
	}
}