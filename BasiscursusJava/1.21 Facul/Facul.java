// Facul.java: Methode om n! te berekenen
// BvB 06.01.2016

public class Facul
{ public static void main(String[] args)
  { for (int i=0; i<=10; i++)
        System.out.println(i+"! = " + fac(i));
  }
  static int fac(int i)
  { int prod=1;
    for (int j=2;j<=i;j++)
        prod *= j;
    return prod;
  }
}
