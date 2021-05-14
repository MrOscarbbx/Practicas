package mx.com.softgame.poo1game.ventanas;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

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
		lblN=new JLabel("0");
		btnExit=new JButton("Salir");
		lblLeidos= new JLabel("Caracteres Leidos");
	}

	public void initComponents(){
		f.setLayout(new FlowLayout());
		f.add(lblFile);
		f.add(txtFile);
		f.add(btnOpen);
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				openFile();
			}
		});
		f.add(txtContenido);
		f.add(lblLeidos);
		f.add(lblN);
		f.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				f.dispose();
			}
		});
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
		txtContenido.setText("");
		File archivo=new File(path);
		if (!archivo.exists()) {
			JOptionPane.showMessageDialog(null,"No Existe");
			return;	
		}
		if (archivo.isFile()){
			getContenido(archivo);
		}
		else if (archivo.isDirectory()){
			getList(archivo);
		}
	}

	public void getContenido(File arch){
		String linea;
		try{
			FileReader input = new FileReader(arch);
			BufferedReader bufInput = new BufferedReader(input);
			linea = bufInput.readLine();
			int count=Integer.parseInt(lblN.getText());
			while ( linea != null ) {
				count+=linea.length();
				txtContenido.append(linea+"\n");
				linea = bufInput.readLine();
			}
			int total=Integer.parseInt(lblN.getText())+count;
			lblN.setText(String.valueOf(total));
			bufInput.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public void getList(File arch){
		String[] lista = arch.list();
		int count=Integer.parseInt(lblN.getText());
		for (String archivo :lista ) {
			count+=archivo.length();
			txtContenido.append(archivo+"\n");
		}
		lblN.setText(String.valueOf(Integer.parseInt(lblN.getText())+count));
	}
}