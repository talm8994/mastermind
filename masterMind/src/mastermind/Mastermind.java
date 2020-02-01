package mastermind;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mastermind extends Canvas implements MouseListener  {
	  private static final int ROWS = 10;
	  private int dw, dh, currentColor;
	  private Color colors[] = { Color.red,  Color.green,   Color.blue,
	                             Color.cyan, Color.magenta, Color.yellow };

	  public void mousePressed( MouseEvent e ) {
	    int x = e.getX(), y = e.getY();
	    if (y < dh*(ROWS+1)+dh/2) {           
	      x = (x - dw) / dw;                 
	      
	      Graphics g = getGraphics();
	      g.setColor( colors[currentColor] );
	      g.fillRect( dw*(x+1), dh, dw, dh );
	    } else {                             
	      currentColor = (x - dw/2) / dw;     
	   
	  } 
	    }
	  public void mouseEntered(  MouseEvent e ) { }
	  public void mouseExited(   MouseEvent e ) { }
	  public void mouseClicked(  MouseEvent e ) { }
	  public void mouseReleased( MouseEvent e ) { }

	  public void paint( Graphics g ) {
	    dw = (int) getSize().width / 7;
	    dh = (int) getSize().height / (ROWS+3);
	    for (int i=0; i < ROWS+1; i++)
	      g.drawLine( dw, dh*(i+1), 6*dw, dh*(i+1) );
	    for (int i=0; i <  6; i++)
	      g.drawLine( dw*(i+1), dh, dw*(i+1), (ROWS+1)*dh );
	    for (int i=0; i < ROWS; i++)
	      g.drawLine( dw*5, (i+1)*dh+dh/2, dw*6, (i+1)*dh+dh/2 );  
	    g.drawLine( dw*5+dw/2, dh, dw*5+dw/2, dh*(ROWS+1) );  
	   
	    for (int i=0; i < 6; i++) {
	      g.setColor( colors[i] );
	      g.fillRect( i*dw+dw/2, dh*(ROWS+1)+dh/2, dw, dh );  
	  } }

	  public Mastermind() {
	    JFrame frame = new JFrame( "Mastermind" );
	    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    setBackground( Color.white );
	    frame.getContentPane().add( this );
	    addMouseListener( this );
	    frame.setSize( new Dimension( 220, 430 ) );
	    frame.setVisible( true );
	  }

	  public static void main( String[] args ) {
	    new Mastermind();
	} }
	
	
	
	
	

