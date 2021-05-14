package mx.com.softgame.poo1game.ventanas;
import mx.com.softgame.poo1game.hilos.Hilo;
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
		initComponents();
	}
	public void initComponents(){
		menuBar=new JMenuBar();
		lblA=new JLabel("A");
		lblB=new JLabel("B");
		lblC=new JLabel("C");
		lblD=new JLabel("D");
		mnuArchivo=new JMenu("Archivo");
		mnuInicio=new JMenuItem("Inicio");
		mnuSalir=new JMenuItem("Salir");
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
		this.setJMenuBar(menuBar);
		this.add(lblA);
		this.add(lblB);
		this.add(lblC);
		this.add(lblD);
		this.setSize(400, 600);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setVisible(true);

	}
	public void iniciarHilos(){
		Hilo hil1=new Hilo("A",lblA);
		Hilo hil2=new Hilo("B",lblB);
		Hilo hil3=new Hilo("C",lblC);
		Hilo hil4=new Hilo("D",lblD);
		hil1.start();
		hil2.start();
		hil3.start();
		hil4.start();
	}
}