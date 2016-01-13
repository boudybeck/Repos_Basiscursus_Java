// BMI.java: Bereken de B(ody) M(ass) Index op basis van een handmatig ingegeven gewicht in kg en programma-argument lengte in cm
// formule: bmi = g*10000 / l2
// BvB 05.01.2016

import java.io.*;


public class BMI
{ public static void main(String[] args)
  throws java.io.IOException
  { InputStreamReader isr =
    new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(isr);
    System.out.println("Typ gewicht in kg: ");
    String getalstring = in.readLine();
    int g,l,l2=0;
    g = Integer.parseInt(getalstring);
    if (g<=0)
    { System.out.println("Groter dan 0 graag!");
      return;
    }
    if (args.length != 1)
    { System.out.println("Geef lengte als programma-argument mee!");
      return;
    }
    l = Integer.parseInt(args[0]);
    l2 = l*l;
    double bmi = g*10000 / l2;
    System.out.println(" BMI: " + bmi);
  }
}
