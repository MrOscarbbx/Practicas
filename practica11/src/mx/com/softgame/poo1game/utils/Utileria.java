package mx.com.softgame.poo1game.utils;

public class Utileria{
	private static int contadorID=0;

	public Utileria(){
		//Al ser privado no se va a ejecutar
	}
	public static int getID(){
		contadorID++;
		return contadorID;
	}
}