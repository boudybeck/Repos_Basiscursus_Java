// ProgArgs.java: Programma-argumenten
// BvB 05.01.2016

public class ProgArgs
{ public static void main(String[] args)
  { if (args.length == 0)
       System.out.println(
       "Geen programma-argumenten gebruikt.");
    else
       for (int i=0; i<args.length; i++)
           System.out.println(args[i]);
  }
}

