package mx.com.softgame.poo1game.prueba;
import mx.com.softgame.poo1game.personajes.malos.Zombie;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.Personaje;
import  mx.com.softgame.poo1game.utils.Tablero;
import  mx.com.softgame.poo1game.utils.TheException;

public class PruebaTableroE{
	public static void main(String[] args) {
		Personaje[] arr={
			new Planta("Giovanna",50),
			new Zombie("Miguel",false),
			new Zombie("Karen",true),
			new Planta("Leonardo",99),
			new Planta("Sebastian",30),
			new Zombie("Hanna"),
			new Planta("Oscar"),
			new Zombie("Brian",false),
			new Planta("Lesly",9),
			new Planta("Vania",10),
			new Zombie("Erick",20,false),
			new Planta("Aline",40)
		};
		try{
		for (Personaje p:arr) {
			Tablero.addPersonaje(p);
		}
		Tablero.delPersonaje();
		/* COMENTARIO 1:
		error: unreported exception TheException; must be caught or declared to be thrown
		-El error sale porque no hemos declarado los metodos para lanzar las excepciones
			COMENTARIO 2:
		-Solo sale una linea de salida ya que el try lanza la excepcion inicial, y ya no ejecuta
			lo demas
		*/
		Tablero.showAll();
		for (int i=0; i<15 ;i++) {
			Tablero.delPersonaje();
			}
		}catch(TheException e){
			System.out.println(e+" "+e.getPoss());
		}
	}
}