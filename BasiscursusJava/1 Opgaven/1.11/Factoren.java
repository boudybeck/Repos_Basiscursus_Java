// Factoren.java: ontbind een gegeven getal in factoren (d.w.z. herdefinieer het als een product van priemgetallen)
// BvB 12.01.2016

import java.io.*;

public class Factoren
{ public static void main(String[] args)
  throws java.io.IOException
  { InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(isr);
    System.out.print("Geef een natuurlijk getal > 1: ");
    System.out.flush();
    int a = Integer.parseInt(in.readLine());
    if (a<2)
    { System.out.println("Te klein");
      System.exit(1);
    }
    System.out.print("Ontbinding in factoren van het natuurlijk getal " + a + ":\n");
    int d=2;
    while (d<a)
    { if (a%d == 0)
      { System.out.print(d + "*");
        a /= d;
      }
      else
      if (d==2) d=3;
      else
      d += 2;
    }
    System.out.println(d);
  }
}