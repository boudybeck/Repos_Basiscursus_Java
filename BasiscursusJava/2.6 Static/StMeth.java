// StMeth.java: Een klasse met een statische methode.
// BvB 12.01.2016

public class StMeth
{ public static void main(String[] args)
  { System.out.println(" x  f(x)");
    for (int i=0; i<3; i++)
    { double x=i;
      System.out.println(x+" "+ Reken.f(x));
    }
  }
}

class Reken
{ static double f(double x)
  { return x*x*x+1/(x*x+1);
  }
}