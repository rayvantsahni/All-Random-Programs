public class ThreeOrFive
{
  public static void main(String[] args)
  {
    for (int i = 1; i <= 100; i++)
    {
      if (i % 3 == 0)
      {
        if (i % 5 == 0) System.out.println("Both");
        else System.out.println("Three");
      }
      else if (i % 5 == 0) System.out.println("Five");
      else System.out.println(i);
    }
  }
}
