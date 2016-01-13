// Reken.java: een programma dat de som s van een ingegeven natuurlijk getal n berekent.
// s = 1 + 2 + ... + n = 1/2n(n+1)
// BvB 04.01.2016
import java.io.*;

public class Reken
{ public static void main(String[] args)
         throws java.io.IOException
  { InputStreamReader isr =
         new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(isr);
    System.out.print("Typ n: ");
    System.out.flush();
    int n;
    String getalstring = in.readLine();
    n = Integer.parseInt(getalstring);
    double s = 0;
    for (int i=1; i<=n; i++)
        s += i;
    System.out.println(" s = " + s);
  }
}
