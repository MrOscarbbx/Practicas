package mx.com.softgame.poo1game.hilos;
import javax.swing.JLabel;
import java.io.*;
public class Hilo extends Thread{
	String nombre;
	JLabel etiqueta;
	public Hilo(String nombre,JLabel etiqueta){
		this.nombre=nombre;
		this.etiqueta=etiqueta;
	}
	public void run(){
		String str="";
		for (int i=0;i<30 ;i++ ) {
			str=etiqueta.getText();
			char c=str.charAt(str.length());
			str+=c+"";
			etiqueta.setText(str);
			int n=(int)(Math.random()*1000);
			try{
				this.sleep(n);
			}catch(InterruptedException e){
				System.err.println(e);
			}
		}
		str+="HECHO";
		etiqueta.setText(str);
	}
}