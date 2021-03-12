//Inicio 7:35
package mx.com.softgame.poo1game.personajes;

public class Personaje{
	protected String nombre;
	protected int vida;
	
	public Personaje(String nombre, int vida){
		this.nombre=nombre;
		this.vida=vida;
	}
	public Personaje(String nombre){
		this(nombre,3);
	}
	
	public String toString(){
		return (nombre+"\t"+vida);
	}
	public void setNombre(String nombre){
		if((nombre.length())>=3 && (nombre.length())<=10){
			this.nombre=nombre;
		};
	}
	public String getNombre(){
		return nombre;
	}
	public void saludar(){
	System.out.println("Hola Alumno de POO  "+nombre);
	}
	public int getVida(){
		return vida;
	}
	public boolean setVida(int vida){
		if(vida>0 && vida<100){
			this.vida= vida;
			return true;
			}
			else {
				return false;
			}
	
	}
	public void decVida(){
		if (vida!=0 && vida>0){
			vida -= 1;
		}
	}
	public void decVida(int x){
		if ((vida!=0 && vida>0) && ((vida-x)>=0)) {
			vida -= x;
		}
	
	}

}