package mx.com.softgame.poo1game.utils;
import mx.com.softgame.poo1game.personajes.Personaje;
import java.util.*;
public class SortId implements Comparator<Personaje> {
	public int compare(Personaje o1,Personaje o2){
		int com=(o1.getId()-o2.getId());
		if (com==0) {
			return 0;
		}else if (com<1) {
			return 1;
		}else{return -1;}
	}
}