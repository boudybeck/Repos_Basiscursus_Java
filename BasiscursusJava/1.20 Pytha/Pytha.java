// Pytha.java: Zoek de getallen a en b voor een als programma-input gegeven natuurlijk getal c, waarvoor de stelling van Pythagoras geldt,
// dus: a2 + b2 = c2
// BvB 05.01.2016

public class Pytha
{ public static void main(String[] args)
  { int a,b=0,c,c2;
    if (args.length != 1)
    { System.out.println("Geef getal c als programma-argument mee!");
      return;
    }
    c = Integer.parseInt(args[0]);
    c2 = c*c;
    boolean gevonden = false;
  lussen:
    for (a=1;a<c;a++)
    { for (b=1;b<=a;b++)
      {   if (a*a+b*b==c2)
          { gevonden = true;
            break lussen;
          }
      }
    }
    System.out.println(
           gevonden ? "a = " + a + " b = "+ b
                    : "Geen a en b gevonden.");
  }
}
   