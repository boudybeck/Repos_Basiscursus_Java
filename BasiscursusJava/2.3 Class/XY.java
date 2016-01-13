// XY.java: Een eigen klasse
// BvB 12.01.2016
public class XY
{ public static void main(String[] args)
  { Punt P = new Punt();
    Punt Q = new Punt(5.3, 7.2);
    P.toon();
    Q.toon();
    System.out.println("xQ = " + Q.x);
  }
}

class Punt
{ Punt() {this(0,0);}
  Punt(double x0,double y0){ x=x0 ; y=y0; }
  void toon()
  { System.out.println("x="+x+" y="+y);}
  double x,y;
}
