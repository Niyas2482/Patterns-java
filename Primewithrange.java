import java.util.Scanner;

public class Primewithrange{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=2;i<=25;i++)
    {
        int div=2;
        boolean isprime=true;
        while (div<=i/2) 
        {
          if(i%div==0)
          {
            isprime=false;
            break;
        }
        div++;

        }
        System.out.println(isprime?i+"":"");

    }
}
}
