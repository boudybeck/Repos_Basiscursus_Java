// Munt.java: Bereken hoe een ingegeven bedrag in een veelvoud van 5 eurocent uitbetaald kan worden in een minimaal aantal euromunten
// 2/1 Euro, 50/20/10/5 eurocent
// BvB 07.01.2016

import java.io.*;

public class Munt
{ public static void main(String[] args)
  throws java.io.IOException
  { InputStreamReader isr =
    new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(isr);
    System.out.println("Typ bedrag in eurocent in: ");
    String getalstring = in.readLine();
    int b1,b2,b3,b4,b5,b6,b7,m1,m2,m3,m4,m5,m6,e,ec;
    b1 = Integer.parseInt(getalstring);
    m1=b1%5; // test of input veelvoud van 5 is, b.v. 3 euro 65
    if (m1!=0)
    { System.out.println("Een veelvoud van 5 graag!");
      return;
    }
    m2=b1/200; // b.v. m2=trunc(365/200) = 1 --> 1 2-euromunt
    b2=b1%200; // b.v. mod(365,200) = 165
    m3=b2/100; // b.v. m3=trunc(165/100) = 1 --> 1 1-euromunt
    b3=b2%100; // b.v. mod(165,100) = 65
    m4=b3/50; // b.v. m4=trunc(65/50) = 1 --> 1 50-centmunt
    b4=b3%50; // b.v. mod(65,50)=15;
    m5=b4/20; // b.v. m5=trunc(15/20) = 0 --> geen 20-centmunt
    b5=b4%20; // n.v.t.
    m6=b5/10; // b.v. m6=trunc(15/10) = 1 --> 1 10-centmunt
    b6=b5%10; // b.v. mod(15,10) = 5
    b7=b6/5; // dit is alleen 1 of 0
    e=b1/100; // alleen voor terugmelding
    ec=b1%100; // idem

    System.out.println
    (" Bedrag " + e + " Euro " + ec + " cent wordt als volgt uitbetaald: " 
    + m2 + " x 2 Euro, " 
    + m3 + " x 1 Euro, " 
    + m4 + " x 50 Eurocent, "
    + m5 + " x 20 Eurocent, "
    + m6 + " x 10 Eurocent, "
    + b7 + " x 5 Eurocent.");

  }

}
