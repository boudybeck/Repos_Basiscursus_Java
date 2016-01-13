// BTW.java: Bereken prijs exclusief de B(ruto) T(oegevoegde) W(aarde) op basis van een handmatig ingegeven bedrag in eurocent en programma-argument BTW percentage
// formule: btw = b*(1-(p/100))
// Tegenwoordig zijn het lage en hoge BTW tarief resp 6 en 21% (bron: Wikipedia.nl)
// BvB 06.01.2016

import java.io.*;


public class BTW
{ public static void main(String[] args)
  throws java.io.IOException
  { InputStreamReader isr =
    new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(isr);
    System.out.println("Typ prijs in eurocent: ");
    String getalstring = in.readLine();
    int b,p,p1=0;
    b = Integer.parseInt(getalstring);
    if (b<=0)
    { System.out.println("Groter dan 0 graag!");
      return;
    }
    if (args.length != 1)
    { System.out.println("Geef BTW percentage als programma-argument mee!");
      return;
    }
    p = Integer.parseInt(args[0]);
    p1 = 100*b-b*p;
    double btw = p1/100;
//    double btw = b*(1-(p1));
    System.out.println("Prijs excl BTW (" + p + " %): " + btw);
  }
}
