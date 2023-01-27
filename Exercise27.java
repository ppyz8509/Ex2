import java.util.Scanner;
public class Exercise27 {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("Please, enter product name :");
          String name = input.nextLine();
          System.out.println("Please, enter product price :");
          float price = input.nextFloat();
          float total_price = price + (price * 0.07f);
          System.out.println("You have to pay : " + name + " : " + total_price + "baht"); 
     }
}
