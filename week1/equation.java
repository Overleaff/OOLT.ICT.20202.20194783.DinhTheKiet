import java.util.Scanner;

public class equation {

  public static void main(String[] Strings) {

/*        Scanner input = new Scanner(System.in);

            System.out.print("Input a: ");
            double a = input.nextDouble();
            System.out.print("Input b: ");
            double b = input.nextDouble();*/
            int a = 1; int b = 2;

			if (( a == 0) && ( b == 0 )) System.out.print("not an equation");
			if (( a == 0) && ( b != 0 )) System.out.println("not an equation");
			if (( a != 0) && ( b != 0 )) System.out.println(" x=" + (float)(-b/a));

  }
}