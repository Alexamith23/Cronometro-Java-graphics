package cronometro;

import javax.swing.JFrame;

/**
 *
 * @author Samir Portillo
 */
public class Cronometro {

    public static void main(String[] args) throws InterruptedException
    {
          JFrame frm = new JFrame("DemoGraphics v.01");
          frm.setUndecorated(true);
          frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frm.add(new PanelCronometro());
          frm.pack();
          frm.setSize(590, 300);
          frm.setLocationRelativeTo(null);
          frm.setVisible(true);
          while(true)
          {
            frm.repaint();
            Thread.sleep(200);
          }
    }
    
}
