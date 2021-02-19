//Inicio 8:50
package mx.com.softgame.poo1game.personajes;

public class Personaje{
	private String nombre;
	private int edad;
	
	public Personaje(String nombre){
		this.nombre=nombre;
		edad=0;
	}
	
	public String getDetalle(){
		return 
	}
	public void setNombre(String nombre){
		if(Integer.parseInt(nombre)>3 && Integer.parseInt(nombre)<10){
			this.nombre=nombre;
		};
	}
	public String getNombre(){
		return nombre;
	}
	public void saludar(){
	System.out.println("Hola Alumno de POO  "+nombre);
	}
	public int getEdad(){
		return edad;
	}
	public boolean setEdad(int edad){
		if(edad>0 && edad<120){
			this.edad= edad;
			return true;
			}
			else {
				return false;
			}
	
	}
}