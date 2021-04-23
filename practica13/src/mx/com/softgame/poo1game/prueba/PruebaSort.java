package mx.com.softgame.poo1game.prueba;
import mx.com.softgame.poo1game.personajes.malos.Zombie;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.utils.SortId;
import java.util.*;
public class PruebaSort{
	public static void main(String[] args) {
		TreeSet<Personaje> ts = new TreeSet<Personaje>();
		ts.add(new Planta("Cristian",70));
		ts.add(new Planta("Karen",50));
		ts.add(new Zombie("Hanna",80,false));
		ts.add(new Zombie("Erick",false));
		ts.add(new Zombie("Esmeralda",80,false));
		ts.add(new Planta("Miguel",99));
		ts.add(new Planta("Jaime",50));
		ts.add(new Zombie("Cristian",80,false));
		ts.add(new Zombie("Miguel",80,false));
		ts.add(new Planta("Karen",50));
		for (Personaje p :ts ) {
			System.out.println(p);
		}
		System.out.println("***");
		LinkedList<Personaje> ls=new LinkedList<Personaje>();
		Collections.sort(ls, new SortId());
		ls.add(new Planta("Crlstian",70));
		ls.add(new Planta("Karen",50));
		ls.add(new Zombie("Hanna",80,false));
		ls.add(new Zombie("Erick",false));
		ls.add(new Zombie("Esmeralda",80,false));
		ls.add(new Planta("Miguel",99));
		ls.add(new Planta("Jaime",50));
		ls.add(new Zombie("Crlstian",80,false));
		ls.add(new Zombie("Miguel",80,false));
		ls.add(new Planta("Karen",50));
		for (Personaje l :ls ) {
			System.out.println(l);
		}
	}
}
