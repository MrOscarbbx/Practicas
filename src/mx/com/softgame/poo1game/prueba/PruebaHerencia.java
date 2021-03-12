package mx.com.softgame.poo1game.prueba;
import mx.com.softgame.poo1game.personajes.malos.Zombie;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.Personaje;

public class PruebaHerencia{
	public static void main(String[] args) {
		Personaje[] personajes={
			new Personaje("Omar",99),
			new Planta("Karen",50),
			new Zombie("Hanna",80,false),
			new Personaje("Omar",99),
			new Planta("Karen",50),
			new Zombie("Hanna",80,false)
		};

		int i=0;
		while (i<personajes.length) {
			reg:
			for (Personaje p:personajes) {
				if (personajes[i]==p) {
					System.out.println("***"+personajes[i]+" es identico a "+p+", son el mismo Objeto***");
					continue reg;
				}
				if (personajes[i].equals(p)) {
					System.out.println("**"+personajes[i]+" es igual a "+p+", son diferentes Objetos**");
				 	continue reg;
				}
				System.out.println(personajes[i]+" != "+p);
				}
			i++;
			}
		}
	}
