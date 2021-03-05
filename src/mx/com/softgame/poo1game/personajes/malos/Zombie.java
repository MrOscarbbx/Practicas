package mx.com.softgame.poo1game.personajes.malos;
import mx.com.softgame.poo1game.personajes.Personaje;

public class Zombie extends Personaje{
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

	public String getDetalle(){
		return (nombre+"\t"+vida+"\t"+ataque);
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


}