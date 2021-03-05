package mx.com.softgame.poo1game.prueba;
import mx.com.softgame.poo1game.personajes.malos.Zombie;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.Personaje;

public class PruebaHerencia{
	public static void main(String[] args) {
		Personaje per01=new Personaje("Valeria",99);
		Personaje per02=new Personaje("Octavio");
		Personaje paln01=new Planta("Wendy",10,'B');
		Personaje paln02=new Planta("Ricardo",50);
		Personaje paln03=new Planta("Vania",'C');
		Personaje paln04=new Planta("Alan");
		Personaje zom01=new Zombie("Karen",80,false);
		Personaje zom02=new Zombie("Eduardo",true);
		Personaje zom03=new Zombie("Esmeralda");

		Personaje[] personajes=new Personaje[9];
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
			if (i instanceof Planta) {
				Planta j=(Planta) i;
				System.out.println("Soy planta "+j.getEscudo());
			}
			if (i instanceof Zombie) {
				Zombie l=(Zombie) i;
				System.out.println("Soy planta "+l.getAtaque());
			}
			int k=(int)(Math.random()*10);
			i.decVida(k);
			System.out.println(i.getDetalle());
		}

	}
}