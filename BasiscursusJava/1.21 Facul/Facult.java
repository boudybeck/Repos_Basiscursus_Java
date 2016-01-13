// Facult.java: Methode om n! te berekenen, met beveiligde rekenfunctie en verbeterde uitvoer.
// BvB 06.01.2016

public class Facult
{ public static void main(String[] args)
  { int n;
    for (n=0;;n++)
    {   long k = faclong(n);
        if (k<0) break;
        outlong(n,2);
        System.out.println("! = ");
        outlong(k,19);
        System.out.println("");
    }
  }
  static long faclong(long i)
  { long prod=1L,x;
    for (int j=2;j<=i;j++)
    {    x = prod*j;
         if (x<=prod)
         return -1L;
         prod = x;
    }        
    return prod;
  }
   static void outlong(long x, int w)
   {      if (x==0){spa(w-1); System.out.print("0");return;}
          boolean neg = x<0;
          if (neg) x=-x;
          long y=x, macht=1;
          int n=1;
          while (y>9){y/=10;n++;macht*=10;}
// Er zullen n cijfers verschijnen.
          if (neg) {spa(w-n-1); System.out.print("-");}
          else spa(w-n);
          while (macht>0)
          { System.out.print((int) (x/macht)); // 1 cijfer
            x %= macht;
            macht /= 10;
          }
   }

   static void spa(int n)
   { for (int i=0;i<n;i++)
         System.out.print(" ");
   }
}

