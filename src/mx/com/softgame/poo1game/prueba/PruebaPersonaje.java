//Inicio 7:45
package mx.com.softgame.poo1game.prueba;
import mx.com.softgame.poo1game.personajes.Personaje;

public class PruebaPersonaje{
	public static void main (String[] args){
		Personaje per01=new Personaje("Omar");
		Personaje per02=new Personaje("Erick");
		Personaje per03=new Personaje("Wendy");
		Personaje per04=new Personaje("Lesly");
		for (int i=0;i<3 ;i++ ) {
			int ed=(int)(Math.random()*250);
			if (per01.setEdad(ed)){
				per01.setEdad(ed);
				System.out.println(per01.getDetalle()+"se modifico la edad");
			}else{
				System.out.println(per01.getDetalle()+"sin se modifico la edad"+per01.getEdad());
			}
			int ed=(int)(Math.random()*250);
			if (per02.setEdad(ed)){
				System.out.println(per02.getDetalle()+"se modifico la edad");
			}else{
				System.out.println(per02.getDetalle()+"sin se modifico la edad"+per02.getEdad());
			}
			int ed=(int)(Math.random()*250);
			if (per03.setEdad(ed)){
				System.out.println(per03.getDetalle()+"se modifico la edad");
			}else{
				System.out.println(per03.getDetalle()+"sin se modifico la edad"+per03.getEdad());
			}
			int ed=(int)(Math.random()*250);
			do{
				if (per04.setEdad(ed)==150) {
					System.out.println("***BINGO***");
				}while(per04.setEdad(ed));
			System.out.println(per04.getDetalle())
		}
	}
}
//
