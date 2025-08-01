//Inicio 7:35
package mx.com.softgame.poo1game.personajes;
import mx.com.softgame.poo1game.utils.*;

public abstract class Personaje{
	protected String nombre;
	protected int vida;
	private final int id;
	
	public Personaje(String nombre, int vida){
		this.nombre=nombre;
		this.vida=vida;
		id=Utileria.getID();
	}
	public Personaje(String nombre){
		this(nombre,3);
	}
	
	public String toString(){
		return ("["+id+"]"+nombre+"("+vida+")");
	}
	public abstract void setNombre(String nombre);
	// abstract methods cannot have a body
	
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
		if ((vida-x)>=0) {
			vida -= x;
		}
	
	}
	public abstract boolean equals(Object o);/*
	// abstract methods cannot have a body
	{
		boolean iguales=false;
		if (o!=null && (o instanceof Personaje)) {
			Personaje ej=(Personaje) o;
			if ((this.nombre==ej.nombre)&&(this.vida==ej.vida)) {
				iguales=true;
			}
		}
		return iguales;
	}
	*/
	public final String getIdVida(){
		return id+"\t"+vida;
	}

}