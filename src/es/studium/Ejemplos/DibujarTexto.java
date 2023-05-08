package es.studium.Ejemplos;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class DibujarTexto extends Frame implements WindowListener
{
	private static final long serialVersionUID = 1L;

	public DibujarTexto()
	{
		addWindowListener(this);
		setSize(200, 100);
		setLocationRelativeTo(null);
		setVisible(true); // --> repaint()--> update()--> paint()
	}

	public void paint(Graphics g)
	{
		// Creamos la fuente
		Font font = new Font("Broadway", Font.BOLD, 14);
		// Aplicamos la fuente
		g.setFont(font);
		g.drawString("Hola, mundo!", 30, 60);
	}

	public static void main(String[] args)
	{
		new DibujarTexto();
	}
	
	public void windowActivated(WindowEvent we){}
	
	public void windowClosed(WindowEvent we){}
	
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	
	public void windowDeactivated(WindowEvent we){}
	
	public void windowDeiconified(WindowEvent we){}
	
	public void windowIconified(WindowEvent we){}
	
	public void windowOpened(WindowEvent we){}
}
