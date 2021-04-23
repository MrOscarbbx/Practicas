package mx.com.softgame.poo1game.utils;
import mx.com.softgame.poo1game.personajes.Personaje;
import java.util.*;
public class SortId implements Comparator {
	public int compare(Object o1,Object o2){
		int com=((Personaje)o1).getId()-((Personaje)o2).getId();
		if (com==0) {
			return 0;
		}else if (com<1) {
			return -1;
		}else{return 1;}
	}
}