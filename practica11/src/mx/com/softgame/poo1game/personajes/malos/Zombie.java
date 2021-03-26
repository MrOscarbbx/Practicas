package mx.com.softgame.poo1game.personajes.malos;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.utils.*;

public final class Zombie extends Personaje{
	private boolean ataque;

	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre,vida);
		this.ataque=ataque;
	}
	public Zombie(String nombre,boolean ataque){
		this(nombre,3,ataque);
	}
	public Zombie(String nombre){
		this(nombre,4,false);
	}

	public boolean getAtaque(){
		return ataque;
	}

	public String toString(){
		return (super.toString()+"{"+ataque+"}");
	}

	public void decVida(){
		if (vida!=0 && vida>0){
			if (ataque) {
				vida-=3;
			}else {
				vida -= 1;
			}
			
		}
	}
	public void decVida(int x){
		if ((vida!=0 && vida>0) && ((vida-x)>=0)) {
			if (!ataque) {
				vida -= (x*3);
			}else {
				vida -= (x*2);
			}
			
		}
	}
	public boolean equals(Object o){
		boolean iguales=false;
		if (o!=null && (o instanceof Zombie)) {
			Zombie ej=(Zombie) o;
			if ((this.nombre==ej.nombre)&&(this.vida==ej.vida)&&(this.ataque==ej.ataque)) {
				iguales=true;
			}
		}
		return iguales;
	}
	/*
	public String getIdVida(){
		return Utileria.getID()+" "+vida+" "+ataque;
		//getIdVida() in Zombie cannot override getIdVida() in Personaje

	}
	*/

}