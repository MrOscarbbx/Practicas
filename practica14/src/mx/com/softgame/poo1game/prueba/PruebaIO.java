package mx.com.softgame.poo1game.prueba;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.ObjectOutputStream;
import mx.com.softgame.poo1game.personajes.malos.Zombie;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.Personaje;
public class PruebaIO {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Archivo:");
		String param=sc.next();
		File file= new File(param);
		String path = System.getProperty("user.home");
		path+=System.getProperty("file.separator")+file;
		File input= new File(path);

		if (input.exists()) {
			ArrayList<Personaje> personajes= new ArrayList<Personaje>();
			try{
			FileReader fr= new FileReader(input);
			BufferedReader br=new BufferedReader(fr);
			String linea;
			String cuantos=br.readLine();
			int count=Integer.valueOf(cuantos);
			for (int i = 0; i < count; i++) {
                  linea = br.readLine();
                  String[] partes = linea.split(",");
                  if(partes[0].equals("Z")){
                      personajes.add(new Zombie(partes[1]));
                  }else{
                      personajes.add(new Planta(partes[1]));  
                  }
              }
              br.close();
			}catch(Exception e){
				System.out.println(e);
			}

			String documento=System.getProperty("user.home")+System.getProperty("file.separator")+"pvsz.out";

			try {
            FileOutputStream output = new FileOutputStream(documento);
            ObjectOutputStream s = new ObjectOutputStream(output); 
            for (Personaje p : personajes) {
              
                s.writeObject (p);
            }
            s.close();
          } catch (Exception e) {
            
          }
		}else{System.out.println("El Archivo no existe"); }
	}
	
}