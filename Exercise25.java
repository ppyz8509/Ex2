import java.util.Scanner;
public class Exercise25 {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("Please, enter your weight(kg) :");
          float weight = input.nextFloat();
          System.out.println("Please, enter your height(cm) :");
          float height = input.nextFloat() / 100;

          float BMI = weight / (height * height);
          System.out.println("Your BMI is "+ BMI);
          if(BMI <=18.5){
               System.out.println("Underweight");
          }
          else if(BMI <=24.9){
              System.out.println("Normal"); 
          } 
          else {
               System.out.println("Obese");
          }         
     }     
}
