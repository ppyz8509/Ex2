import java.util.Scanner;
public class Exercise28 {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("Please, enter product name :");
          String name = input.nextLine();
          System.out.println("Please, enter product price :");
          float price = input.nextFloat();
          System.out.println("Please, enter amount product :");
          int amount = input.nextInt();
          float total = price * amount;
          float Final = total - (total *0.05f);
          System.out.println("You have to pay"+ Final+"baht");  
     }
}
