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
			new Zambie("Hanna",80,false)
		}

		int i=0;
		while (i<personajes.length) {
			i++;
			for (Personaje p:personajes) {
				if (personajes[i].equals(p)) {
				 	System.out.println(personajes[i]+" es igual a "+p+", son diferentes Objetos");
				 	break;
				 }
				if (personajes[i]==p) {
					System.out.println(personajes[i]+" es identico a "+p+", son el mismo Objeto");
					break;
				System.out.println(personajes[i]+" != "+p);
			}
		}

		for (Personaje i:personajes) {
			System.out.println(i.getDetalle());
			if (i instanceof Planta) {
				Planta j=(Planta) i;
				System.out.println("Soy planta "+j.getEscudo());
			}
			if (i instanceof Zombie) {
				Zombie l=(Zombie) i;
				System.out.println("Soy planta "+l.getAtaque());
			}
			int k=(int)(Math.random()*10);
			System.out.println(k+"\t**");
			i.decVida(k);
			System.out.println(i.getDetalle());
		}

	}
}