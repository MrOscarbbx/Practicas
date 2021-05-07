import java.io.File;
public class EjemploFile {
	public static void main(String[] args) {
		String f = Sistem.getProperty("user.home");
		f=+"\\myFile.txt";
		File myFile= new File(f);
		if (myFile.exists()) {
			System.out.println("Si existe");
		}else {
			System.out.println("No existe");
		}
	}
}