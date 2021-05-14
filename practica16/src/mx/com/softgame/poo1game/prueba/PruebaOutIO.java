package mx.com.softgame.poo1game.prueba;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectInput;
import mx.com.softgame.poo1game.personajes.Personaje;
public class PruebaOutIO {
    private static String documento = System.getProperty("user.home")
    						+System.getProperty("file.separator")+"pvsz.out";
    public static void main(String[] args) {
        Personaje pe;
        File archivo = new File(documento);
        if (archivo.exists()) {
            try {
                FileInputStream f =new FileInputStream(documento);
                ObjectInputStream s =new ObjectInputStream (f);
                pe= (Personaje)s.readObject();
                while(pe!=null){
                        System.out.println(pe);
                        pe= (Personaje)s.readObject();
                    }
                s.close ();
            }catch(Exception e) {}
        }else{
            System.out.println("El archivo no existe");
        }   
    }
}