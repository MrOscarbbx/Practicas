package mx.com.softgame.poo1game.prueba;
import mx.com.softgame.poo1game.personajes.buenos;
import mx.com.softgame.poo1game.personajes.malos;
import mx.com.softgame.poo1game.personajes.Personaje;

public class PruebaHerencia{
	public static void main(String[] args) {
		Personaje per01=new Personaje("Valeria",99);
		Personaje per02=new Personaje("Octavio");
		Planta paln01=new Planta("Wendy",10,'B');
		Planta paln02=new Planta("Ricardo",50);
		Planta paln03=new Planta("Vania",'C');
		Planta paln04=new Planta("Alan");
		Zombie zom01=new Zombie("Karen",80,false);
		Zombie zom02=new Zombie("Eduardo",true);
		Zombie zom03=new Zombie("Esmeralda");

		Personaje[] personajes=new Personaje[];
		personajes[0]=per01;
		personajes[1]=per02;
		personajes[2]=paln01;
		personajes[3]=paln02;
		personajes[4]=paln03;
		personajes[5]=paln04;
		personajes[6]=zom01;
		personajes[7]=zom02;
		personajes[8]=zom03;

		for (Personaje i:personajes) {
			System.out.println(i.getDetalle());
			if (i==Planta) {
				System.out.println("Soy planta"+i.getEscudo());
			}
			if (i==Zombie) {
				System.out.println("Soy planta"+i.getAtaque());
			}
			int k=(int)(Math.random()*10);
			i.decVida(k);
			System.out.println(i.getDetalle());
		}

	}
}