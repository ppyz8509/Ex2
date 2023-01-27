import java.util.Scanner;
public class Exercise26 {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("Enter number1");
          float a = input.nextFloat();
          System.out.println("Enter number2");
          float b = input.nextFloat();
          System.out.println("("+ a +" - "+ b +")"+"("+ a +" + "+ b +")"+"=" + (a-b)*(a+b));

     }
     
}
