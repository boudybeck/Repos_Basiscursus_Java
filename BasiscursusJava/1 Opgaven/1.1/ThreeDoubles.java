// Opgave 1.1
// BvB 06.01.2016

import java.io.*;

public class ThreeDoubles
{ public static void main(String[] args)
  throws java.io.IOException
  { InputStreamReader isr =
    new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(isr);
    for (int i=0;i<3;i++) 
    {  System.out.print("Typ een natuurlijk getal: ");
       System.out.flush(); 
       String xString = in.readLine();
       int x, y=0;
       x = Integer.parseInt(xString);
       if (x<=0)
       { System.out.println("Groter dan 0 graag!");
         return;
         }
       y=2*x;
       System.out.println(y);
    }
  }
}
