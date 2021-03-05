package mx.com.softgame.poo1game.personajes.buenos;
import mx.com.softgame.poo1game.personajes.Personaje;

public class Planta extends Personaje{

	public String escudo;

	public Planta(String nombre, int vida, String escudo){

	}
	public Planta(String nombre, String escudo){
		this.vida=3;
	}
	public Planta(String nombre, int vida){
		this.escudo="A";
	}
	public Planta(String nombre){
		this.vida=3;
		this.escudo="A";
	}

	public String getDetalle(){
		return (nombre+"\t"+vida+"\t"+escudo);
	}

	public void decVida(){
		if (vida!=0 && vida>0 &&escudo!="A"){
			vida -= 1;
		}else {
			vida-= 2;
		}
	}
	public void decVida(int x){
		if ((vida!=0 && vida>0) && ((vida-x)<0) && escudo!="A") {
			vida -= x;
		}else {
			vida-=2;
		}
	
	}

	public String getEscudo(){
		return escudo;
	}
}