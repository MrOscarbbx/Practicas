package mx.com.softgame.poo1game.utils;
import mx.com.softgame.poo1game.personajes.Personaje;
public class Tablero{

	public static final int MAX_LINE=10;
	private static int idx=-1;
	private static Personaje[] personajes=new Personaje[MAX_LINE];

	private Tablero(){
	}

	public static boolean addPersonaje(Personaje p){
		if ((idx+1)>=0&&(idx+1)<MAX_LINE) {
			idx++;
			personajes[idx]=p;
			return true;
		}
		return false;
	}
		public static boolean delPersonaje(){
		if ((idx-1)>=-1 && (idx-1)<MAX_LINE){
			personajes[idx]=null;
			idx--;
			return true;
		}
		return false;
	}

		public static void showAll(){
			for (Personaje p:personajes) {
				if (p==null) {
					System.out.println("-");
					
				}else {
					System.out.println(p.getNombre());
				}
			}
		}
}