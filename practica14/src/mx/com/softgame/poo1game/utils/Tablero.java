package mx.com.softgame.poo1game.utils;
import mx.com.softgame.poo1game.personajes.Personaje;
public class Tablero{

	public static final int MAX_LINE=10;
	private static int idx=-1;
	private static Personaje[] personajes=new Personaje[MAX_LINE];

	private Tablero(){
	}

	public static void addPersonaje(Personaje p) throws TheException{
		if ((idx+1)>=0&&(idx+1)<MAX_LINE) {
			idx++;
			personajes[idx]=p;
		}else{
			throw new TheException("No es Posible Agregar el Personaje",idx);
		}
	}
	public static void delPersonaje()throws TheException{
		if ((idx-1)>=-1 && (idx-1)<MAX_LINE){
			personajes[idx]=null;
			idx--;
		}else{
			throw new TheException("No es Posible borrar el Personaje",-1);
		}
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