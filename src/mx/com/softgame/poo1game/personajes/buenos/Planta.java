package mx.com.softgame.poo1game.personajes.buenos;
import mx.com.softgame.poo1game.personajes.Personaje;

public class Planta extends Personaje{

	private String escudo;

	public Planta(String nombre, int vida, char escudo){
		this.nombre=nombre
		this.vida=vida;
		this.escudo=escudo;
	}
	public Planta(String nombre, char escudo){
		this.nombre=nombre;
		this.vida=3;
		this.escudo=escudo;
	}
	public Planta(String nombre, int vida){
		this.nombre=nombre;
		this.vida=vida;
		this.escudo='A';
	}
	public Planta(String nombre){
		this.nombre=nombre
		this.vida=3;
		this.escudo='A';
	}

	public String getDetalle(){
		return (nombre+"\t"+vida+"\t"+escudo);
	}

	public void decVida(){
		if (vida!=0 && vida>0 &&escudo!='A'){
			vida -= 1;
		}else {
			vida-= 2;
		}
	}
	public void decVida(int x){
		if ((vida!=0 && vida>0) && ((vida-x)<0) && escudo!='A') {
			vida -= x;
		}else {
			vida-=2;
		}
	
	}

	public String getEscudo(){
		return escudo;
	}
}