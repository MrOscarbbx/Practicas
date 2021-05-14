
public class Hilo extends Thread{
	String Nombre;
	JLable etiqueta;
	public Hilo(String nombre,JLable etiqueta){
		this.nombre=nombre;
		this.etiqueta=etiqueta;
	}
}