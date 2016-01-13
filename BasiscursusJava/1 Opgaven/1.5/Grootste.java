// Grootste.java: Bepaal het grootste getal van een reeks ingegeven natuurlijke getallen
// waarbij een negatief getal gebruikt wordt als afsluitcode
// BvB 12.01.2016

import java.io.*;

public class Grootste
{ public static void main(String[] args)
         throws java.io.IOException
  { InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(isr);
    System.out.println("Tik onder elkaar een reeks natuurlijke getallen in,\n"
    + "gevolgd door een negatief getal: ");
    int grootste = -1;
    for (;;)
    { int x = Integer.parseInt(in.readLine());
      if (x<0) break;
      if (x>grootste) grootste=x;
    }
    if (grootste<0)
    { System.out.println("Eerst een natuurlijk getal graag.");
      System.exit(1);
    }
    System.out.println("Het grootste ingelezen getal is " + grootste);
  }
}
