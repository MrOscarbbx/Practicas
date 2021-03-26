package mx.com.softgame.poo1game.prueba;
import mx.com.softgame.poo1game.personajes.malos.Zombie;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.Personaje;
import  mx.com.softgame.poo1game.utils.Tablero;

public class PruebaTablero{
	public static void main(String[] args) {
		Personaje[] arr={
			new Planta("Wendy",50),
			new Zombie("Jose",false),
			new Zombie("Karen",true),
			new Planta("Giovanna",99),
			new Planta("Victor",30),
			new Zombie("Vania"),
			new Planta("Ricardo"),
			new Zombie("Brian",false),
			new Planta("Lesly",9),
			new Planta("Carlos",10),
			new Zombie("Cristian",20,false),
			new Planta("Oscar",40)
		}
		
	}
}