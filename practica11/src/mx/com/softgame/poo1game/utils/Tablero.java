package mx.com.softgame.poo1game.utils;

public class Tablero{

	public static final int MAX_LINE=10;
	private static int idx=-1;
	private static Personaje[] personajes=new Personaje[MAX_LINE];

	private Tablero(){
	}

	public static boolean addPersonaje(Personaje p){
		if (idx>=0&&idx<MAX_LINE) {
			personajes[idx]=p;
			idx++;
			return true;
		}
		return false;
	}
		public static boolean delPersonaje(Personaje p){
		if (idx>=0&&idx<MAX_LINE) {
			idx--;
			return true;
		}
		return false;
	}

		public void showAll(){
			for (Personaje p:personajes) {
				if (p!=null) {
					System.out.println(p.getNombre());
				}else {
					System.out.println("-");
				}
			}
		}
}