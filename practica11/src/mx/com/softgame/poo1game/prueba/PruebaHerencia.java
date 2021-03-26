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
		System.out.println(personajes[3].getIdVida());

		int i=0;
		while (i<personajes.length) {
			System.out.println("----------------");
			for (Personaje p:personajes) {
				if (personajes[i]==p) {
					System.out.println("***"+personajes[i]+" es identico a "+p+", son el mismo Objeto***");
					continue;
				}
				if (personajes[i].equals(p)) {
					System.out.println("**"+personajes[i]+" es igual a "+p+", son diferentes Objetos**");
				 	continue;
				}
				System.out.println(personajes[i]+" != "+p);
				}
			i++;
			}
		}
	}
