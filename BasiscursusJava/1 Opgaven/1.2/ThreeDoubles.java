// Opgave 1.2: lees 3 onder elkaar ingevoerde getallen in en geef daarvan de dubbele waarden terug
// BvB 06.01.2016

import java.io.*;

public class ThreeDoubles
{ public static void main(String[] args)
  throws java.io.IOException
  { InputStreamReader isr =
    new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(isr);
    {  System.out.print("Typ een natuurlijk getal: ");
       System.out.flush(); 
       String xString1 = in.readLine();
       int x1, y1=0, x2, y2=0, x3, y3=0;
       
        x1 = Integer.parseInt(xString1);
         if (x1<=0)
         { System.out.println("Groter dan 0 graag!");
           return;
           }
          y1=2*x1;

       System.out.print("Typ een natuurlijk getal: ");
       System.out.flush(); 
       String xString2 = in.readLine();

         x2 = Integer.parseInt(xString2);
         if (x2<=0)
         { System.out.println("Groter dan 0 graag!");
           return;
           }
         y2=2*x2;

       System.out.print("Typ een natuurlijk getal: ");
       System.out.flush(); 
       String xString3 = in.readLine();

         x3 = Integer.parseInt(xString3);
         if (x3<=0)
         { System.out.println("Groter dan 0 graag!");
           return;
           }
          y3=2*x3;

       System.out.println(y1);
       System.out.println(y2);
       System.out.println(y3);
    }
  }
}
