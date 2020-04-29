import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);
      	int x = input.nextInt();
      	if(x%4==0)
        {
			if(x%100==0)
            {
              if(x%400==0)
              {
                System.out.println("Vicky can celebrate his birthday.");
              }
              else
              {
                System.out.println("Vicky can't celebrate.");
              }
            }
          else
          {System.out.println("Vicky can celebrate his birthday.");        }
        }
      else
      {
        System.out.println("Vicky can't celebrate.");
      }
    }
}