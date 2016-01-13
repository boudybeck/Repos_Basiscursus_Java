// PackAppl.java: Een applicatie die gebruik maakt van het package Figuren
// BvB 13.01.2016

//import Figuren.*;

// Cirkel.java:Een klasse 'Circel' voor package 'Figuren'
// BvB 13.01.2016

package Figuren;

public class PackAppl
{ public static void main(String[] args)
  { Figuren.Cirkel C = new Figuren.Cirkel(5.0,4.0,2.0);
    System.out.println("Straal: " + C.r);
  }
}
