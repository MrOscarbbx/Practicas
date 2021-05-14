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
	JMenuItem munInicio;
	JMenuItem mnuSalir;
	public VentanaHilo(){
		menuBar=new JMenuBar();
		lblA=new JLabel("A")
		lblB=new JLabel("B")
		lblC=new JLabel("C")
		lblD=new JLabel("D")
		mnuArchivo=new JMenu("Archivo")
		munInicio=new JMenuItem("Inicio")
		mnuSalir=new JMenuItem("Salir")
	}

}