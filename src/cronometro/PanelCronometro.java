package cronometro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Samir Portillo
 */
public class PanelCronometro extends JPanel implements KeyListener {

    private int ms;
    private Numeros numero;
  
    public PanelCronometro() 
    {
        numero = new Numeros();
        setFocusable(true);
        addKeyListener(this);
        
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(new Color(0,0,64));
        g.fillRect(0, 0, getWidth(), getHeight());
        if (numero.isCorriendo()) 
        {
            ms += 200;
            g.setColor(new Color(0,128,64));
            g.drawString("X = Salir", 18, 20);
            g.drawString("Presione la tecla enter para pausar", 200, 245);
        }
        else
        {
            g.setColor(new Color(0,128,64));
            g.drawString("X = Salir", 18, 20);
            g.drawString("Presione la tecla I para iniciar", 213, 245);
        }

        int segunodos = ms / 1000;

        int horas = segunodos / 3600;
        int uh = horas % 10;
        int dh = horas / 10;

        int minutos = segunodos % 3600 / 60;
        
        int um = minutos % 10;
        int dm = minutos / 10;

        int seg = segunodos % 3600 % 60;
        int us = seg % 10;
        int ds = seg / 10;
        int cadaTresSeg = 0;
        
        cadaTresSeg = cadaTresSeg + seg;
        
        if (cadaTresSeg == 3)
        {
            cadaTresSeg = 0;
        }

        dibujarNumero(ds, g, 350, 0);// Quinto
        dibujarNumero(us, g, 430, 0); //Sexto
        
        dibujarNumero(dm, g, 170, 0);//Tercero
        dibujarNumero(um, g, 250, 0);//Cuarto
        
        dibujarNumero(dh, g, -10, 0);// Primero
        dibujarNumero(uh, g, 70, 0);// Segundo

        g.setColor(new Color(0,128,64));
        g.drawRect(15, 30, 555, 240);
        dibujarPunto(g, 200, 140);
        dibujarPunto(g, 200, 160);
        
        dibujarPunto(g, 380, 140);
        dibujarPunto(g, 380, 160);
    }
    

    
    private void dibujarNumero(int num, Graphics g, int x, int y) 
    {   
        numero.setX(x);
        numero.setY(y);

        if (num == 1 || num == 4 || num == 5 || num == 6 || num == 8 || num == 6 || num == 9 || num == 0) {
            numero.pintarIzquierda(g);
        }
        if (num == 1 || num == 2 || num == 6 || num == 8 || num == 0) {
            numero.pintarIzquierdaAbajo(g);
        }
        if (num == 2 || num == 3 || num == 5 || num == 6 || num == 7 || num == 8 || num == 9 || num == 0) {
            numero.pintarArriba(g);
        }
        if (num == 2 || num == 3 || num == 4 || num == 7 || num == 8 || num == 9 || num == 0) {
            numero.pintarDerecha(g);
        }
        if (num == 3 || num == 4 || num == 5 || num == 6 || num == 7 || num == 8 || num == 9 || num == 0) {
            numero.pintarDerechaabajo(g);
        }
        if (num == 2 || num == 3 || num == 5 || num == 6 || num == 8 || num == 9 || num == 0) {
            numero.pintarAbajo(g);
        }
        if (num == 2 || num == 3 || num == 4 || num == 5 || num == 6 || num == 8 || num == 9) {
            numero.pintarCentro(g);
        }
    }
    
    public void dibujarPunto(Graphics g, int x ,int y)
    {
        g.setColor(new Color(0,128,64));
        g.fillRect(x, y, 7, 7);
        g.fillRect(x, y, 7, 7);
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        System.out.println(numero.isCorriendo());
        System.out.println(e.getKeyCode());
        if (e.getKeyCode() == 73) 
        {          
            numero.setCorriendo(true);           
        } 
        else if (e.getKeyCode() == 32)
        {
            numero.setCorriendo(false);     
        }   
        else if (e.getKeyCode() == 88)
        {
            System.exit(0);
        } 
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {
       
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        
    }

}
