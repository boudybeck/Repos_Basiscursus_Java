// Binair.java: Geef van ingegeven natuurlijk getal (max 255) de bytes terug
// BvB 08.01.2016

import java.io.*;

public class Binair
{ public static void main(String[] args)
  throws java.io.IOException
  { InputStreamReader isr =
    new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(isr);
    System.out.println("Typ natuurlijk getal in (max 511): ");
    String getalstring = in.readLine();
    int n1,n2,n3,n4,n5,n6,n7,n8,n9,p1,p2,p3,p4,p5,p6,p7,p8,m1;
    n1 = Integer.parseInt(getalstring);
    if (n1>511)
    { System.out.println("Max 511 graag!");
      return;
    }
    p1=n1/256;
    n2=n1%256;
    p2=n2/128;
    n3=n2%128;
    p3=n3/64;
    n4=n3%64;
    p4=n4/32;
    n5=n4%32;
    p5=n5/16;
    n6=n5%16;
    p6=n6/8;
    n7=n6%8;
    p7=n7/4;
    n8=n7%4;
    p8=n8/2;
    n9=n8%2;
    m1=n1>>8;

    System.out.println
    (" Bytes van getal " + n1 + ": " 
    + p1 + p2 + p3 + p4 + p5 + p6 + p7 + p8 + n9 + " m1: " + m1);

  }

}
