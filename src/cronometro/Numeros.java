package cronometro;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Samir Portillo
 */
public class Numeros {

    private int x;
    private int y;
    private boolean corriendo;
    
    
    private int tamX = 10;
    private int tamY = 50;
    private int arriX = 40;
    private int arriY = 10;
    public Numeros() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCorriendo(boolean corriendo) {
        this.corriendo = corriendo;
    }

    public boolean isCorriendo() {
        return corriendo;
    }
    
    

    public void pintarIzquierda(Graphics g)
    {
        // izquierda
        g.setColor(new Color(0,128,64));
        g.fillRect(x + 50, y + 100, tamX,tamY);
    }

    public void pintarIzquierdaAbajo(Graphics g) {
        g.setColor(new Color(0,128,64));
        g.fillRect(x + 50, y + 160, tamX,tamY);
    }

    public void pintarDerecha(Graphics g) {
        // izquierda
        g.setColor(new Color(0,128,64));
        g.fillRect(x + 110, y + 100, tamX,tamY);
    }

    public void pintarDerechaabajo(Graphics g) {
        // izquierda
        g.setColor(new Color(0,128,64));
        g.fillRect(x + 110, y + 160, tamX,tamY);

    }

    public void pintarArriba(Graphics g) {
        // izquierda
        g.setColor(new Color(0,128,64));
        g.fillRect(x + 65, y + 100, arriX,arriY);

    }

    public void pintarAbajo(Graphics g) {
        // izquierda
        g.setColor(new Color(0,128,64));
        g.fillRect(x + 65, y + 200, arriX,arriY);

    }

    public void pintarCentro(Graphics g) {
   
        g.setColor(new Color(0,128,64));
        g.fillRect(x + 65, y + 150, arriX,arriY);

    }

}
