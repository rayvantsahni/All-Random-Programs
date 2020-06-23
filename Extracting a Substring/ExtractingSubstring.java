import java.util.Scanner;

class ExtractingSubstring 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        
        for (int i = n1; i <= n2; i++)
        {
            System.out.print(s.charAt(i));
        }
    }
}
