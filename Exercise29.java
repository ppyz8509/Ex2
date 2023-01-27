import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercise29 {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          float rate = 35.5f ;
          System.out.println("Please, input amout of Thai baht: ");
          float baht = input.nextFloat();

          String pattern = "0.00";  
          DecimalFormat df = new DecimalFormat(pattern);

          float us = baht / rate ;
          System.out.println("You got "+us+" $");
          
          float value = 5.56789f;
          String output = df.format(value);
          System.out.println("value = "+value + "\npattern is " + pattern + "\noutput is " + output);
          
          
     }
}
