import java.util.Scanner;
public class Exercise23 {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.print("Input first number: ");
          int num1 = input.nextInt();
          System.out.print("Input second number: ");
          int num2 = input.nextInt();
          System.out.print("Input third number: ");
          int num3 = input.nextInt();
          System.out.print("Input fourth number: ");
          int num4 = input.nextInt();
          System.out.print("Input fifth number: ");
          int num5 = input.nextInt();
          System.out.println("Average of :"+num1+","+num2+","+num3+","+num4+","+num4+" is "+(num1+num2+num3+num4+num5)/5 );
     }
}
