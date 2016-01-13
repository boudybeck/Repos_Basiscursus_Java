// RApplet.java: Een zo groot mogelijke rechthoek en een iets kleinere circel in een applet.
// BvB 04.01.2016
// OneDrive toegevoegd aan exception list

import java.applet.*;
import java.awt.*;

public class RApplet extends Applet
{ public void paint(Graphics g)
  { Dimension d = getSize();
    int breedte = d.width, hoogte = d.height;
    g.drawRect(0,0,breedte-1,hoogte-1);
    int a = Math.min(breedte,hoogte) * 4/5;
    int linkermarge = (breedte-a)/2;
    int bovenmarge = (hoogte-a)/2;
    g.drawOval(linkermarge,bovenmarge,a,a);
  }
}
