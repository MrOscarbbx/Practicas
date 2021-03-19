package mx.com.softgame.poo1game.utils;

public class Utileria{
	private static int contadorID=0;

	private Utileria(){
		contadorID++;
	}
	public static int getID(){
		return contadorID;
	}
}