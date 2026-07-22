package day03;

import java.util.Scanner;
public class shopingCartProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         String item ;
         double price;
         int quantity;
         char currency = '$';
         double total;

        System.out.print("What item would like to buy : ");
        item = scanner.nextLine();
        System.out.print("What is the price of each :");
        price = scanner.nextDouble();
        System.out.print("How many do you want buy :");
        quantity = scanner.nextInt();

        total = quantity * price;

        System.out.println("\n You bought "+quantity+" "+item + "s");
        System.out.println("Your total bill is :"+total+currency);



    }
}
