// Tientallen: toont een reeks machten van 10 onder elkaar
// BvB 12.01.2016

public class Tientallen
{ public static void main(String[] args)
  { int x=1;
    for (int i=0; i<10; i++)
        { outint(x,10);
          x *= 10;
        }
  }

  static void outint(int x, int w) // x>0
  { int y=x, macht=1, n=1;
    while (y>9)
    { y /= 10; n++;
      macht *= 10;
    }
// Er zullen n cijfers verschijnen
    for (int i=0;i<w-n;i++)
       System.out.print(" ");
    while (macht>0)
    { System.out.print((int) (x/macht)); // 1 cijfer
      x %= macht;
      macht /= 10;
    }
    System.out.println("");
  }
}
