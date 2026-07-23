package day04;

import java.util.Scanner;
public class exercise01Hypothenuse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.print("Enter the length of A: ");
        a= scanner.nextInt();
        System.out.print("Enter the length of B: ");
        b= scanner.nextInt();

        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        System.out.println("The Hypothenuse of (side c) is : " + c +"cm");


        scanner.close();
    }

}
