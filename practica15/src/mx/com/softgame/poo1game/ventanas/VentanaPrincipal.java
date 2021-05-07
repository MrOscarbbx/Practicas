package mx.com.softgame.poo1game.ventanas;
import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal{
	JFrame f;
	JLabel lblFile;
	JTextField txtFile;
	JButton btnOpen;
	JTextArea txtContenido;
	JLabel lblN;
	JLabel lblLeidos;
	JButton btnExit;
	public VentanaPrincipal(){
		f= new JFrame("Practica 14");
		lblFile= new JLabel("Nombre de archivo");
		txtFile= new JTextField(20);
		btnOpen= new JButton("Abrir archivo");
		txtContenido= new JTextArea(30,40);
		lblN=new JLabel("CERO");
		btnExit=new JButton("Salir");
		lblLeidos= new JLabel("Caracteres Leidos");
	}

	public void initComponents(){
		f.setLayout(new FlowLayout());
		f.add(lblFile);
		f.add(txtFile);
		f.add(btnOpen);
		btnOpen.addActionListener(openFile());
		f.add(txtContenido);
		f.add(lblLeidos);
		f.add(lblN);
		f.add(btnExit);
		btnExit.addActionListener(dispose());
		f.setSize(550, 440);
		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		VentanaPrincipal v= new VentanaPrincipal();
		v.initComponents();
	}

	public void openFile(){
		String file=txtFile.getText();
		String path= System.getProperty("user.home")+System.getProperty("file.separator")+file;
		System.out.println(path);
		txtContenido.setText();
	}
}