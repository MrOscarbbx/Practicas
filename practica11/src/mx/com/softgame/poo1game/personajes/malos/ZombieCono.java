package mx.com.softgame.poo1game.personajes.malos;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.utils.*;

public class ZombieCono extends Zombie{

	public ZombieCono(String nombre){
		super(nombre);
	}
	/*error: cannot inherit from final Zombie public class ZombieCono extends Zombie
	-El error es porque la clase Zombie es Final
	y ya no puede tener hijos.
	*/
}