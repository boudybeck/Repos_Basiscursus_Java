// Rond.java: Een windows applicatie die een zo groot mogelijke rechthoek en een circel tekent.
// BvB 05.01.2016
import java.awt.*;
import java.awt.event.*;

public class Rond
{ public static void main(String[] args)
  { new FrRond();
  }
}

class FrRond extends Frame
      implements WindowListener
{     CvRond cv;
      FrRond()
      { super("Een circel");
        cv = new CvRond();
        setLayout(new BorderLayout());
        add("Center",(Canvas)cv);
        setSize(500,200);
//        show();
// deprecated --> replaced by line below       
        setVisible(true);
        addWindowListener(this);
      }

public void windowClosing(WindowEvent e)
       {System.exit(0);
       }
public void windowOpened(WindowEvent e) {}
public void windowIconified(WindowEvent e) {}
public void windowDeiconified(WindowEvent e) {}
public void windowClosed(WindowEvent e) {}
public void windowActivated(WindowEvent e) {}
public void windowDeactivated(WindowEvent e) {}
}

class CvRond extends Canvas
{ public void paint(Graphics g)
  { Dimension d = getSize();
    int breedte = d.width, hoogte = d.height;
    g.drawRect(2,2,breedte-5,hoogte-5);
    int a = Math.min(breedte,hoogte) * 4/5;
    int linkermarge = (breedte-a)/2;
    int bovenmarge = (hoogte-a)/2;
    g.drawOval(linkermarge,bovenmarge,a,a);
  }
}
