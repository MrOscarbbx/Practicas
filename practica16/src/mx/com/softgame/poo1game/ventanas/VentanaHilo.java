package mx.com.softgame.poo1game.ventanas;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.io.*;
import java.awt.event.*;

public class VentanaHilo extends JFrame {
	JMenuBar menuBar;
	JLabel lblA;
	JLabel lblB;
	JLabel lblC;
	JLabel lblD;
	JMenu mnuArchivo;
	JMenuItem mnuInicio;
	JMenuItem mnuSalir;
	public VentanaHilo(){
		menuBar=new JMenuBar();
		lblA=new JLabel("A");
		lblB=new JLabel("B");
		lblC=new JLabel("C");
		lblD=new JLabel("D");
		mnuArchivo=new JMenu("Archivo");
		mnuInicio=new JMenuItem("Inicio");
		mnuSalir=new JMenuItem("Salir");
	}
	public void initComponents(){
		this.setLayout(new GridLayout(4,1));
		mnuInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				iniciarHilos();
			}
		});
		mnuSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				dispose();
			}
		});
		mnuArchivo.add(mnuInicio);
		mnuArchivo.add(mnuSalir);
		menuBar.add(mnuArchivo);
		this.add(menuBar);
		this.add(lblA);
		this.add(lblB);
		this.add(lblC);
		this.add(lblD);
		this.setSize(550, 440);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

}