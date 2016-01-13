// ZoekUit.java: Zoek zo mogelijk een geheel getal x waarvoor geldt:
// x(x2+1)=a (dus x3+x=a, b.v. a=30,x=3). Het natuurlijke getal a wordt ingelezen
// BvB 05.01.2016
import java.io.*;

public class ZoekUit
{ public static void main(String[] args)
  throws java.io.IOException
  { InputStreamReader isr =
    new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(isr);
    System.out.println("Typ a: ");
    String getalstring = in.readLine();
    int a, x=0, y;
    a = Integer.parseInt(getalstring);
    if (a<=0)
    { System.out.println("Groter dan 0 graag!");
      return;
    }
    do
    { y=x*(x*x+1);
    if (y==a)
       break;
    x++;
    } while (y<a);
    System.out.println(
    y==a ? "Het gezochte getal is " + x
         : "Er is geen geheel getal x waarvoor geldt\n" +
          "x(x2+1)=a");
  }
}
