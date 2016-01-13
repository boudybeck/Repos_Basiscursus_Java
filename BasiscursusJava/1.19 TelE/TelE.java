// TelE.java: We tellen het aantal letters e of E
// BvB 05.01.2016

public class TelE
{ public static void main(String[] args)
         throws java.io.IOException
  { int n=0;
    char ch;
    System.out.println(
           "Typ tekst, afgesloten met een dollarteken:");
    do
    { ch = (char)System.in.read();
      if (ch == 'e' || ch == 'E') n++;
    } while (ch != '$');
    System.out.println(
           "Er is " + n + "keer een e of een E ingelezen");
  }
}
