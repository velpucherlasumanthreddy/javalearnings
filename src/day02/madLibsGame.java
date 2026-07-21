package day02;

import java.util.Scanner;

public class madLibsGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String place ;
        String animal1 ;
        String adjective1 ;
        String person ;
        String verb ;
        String color ;
        String object ;
        String animal2 ;
        String funnyExclamation ;
        String adjective2 ;

        System.out.print("Enter the place :");
        place = scanner.nextLine();
        System.out.print("Enter a animal1 :");
        animal1 = scanner.nextLine();
        System.out.print("Enter an adective1(description) :");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a personl :");
        person = scanner.nextLine();
        System.out.print("Enter a verb :");
        verb = scanner.nextLine();
        System.out.print("Enter a color :");
        color = scanner.nextLine();
        System.out.print("Enter an object :");
        object = scanner.nextLine();
        System.out.print("Enter a animal2 :");
        animal2 = scanner.nextLine();
        System.out.print("Enter funny exclamation :");
        funnyExclamation = scanner.nextLine();
        System.out.print("Enter an adective2(description) :");
        adjective2 = scanner.nextLine();

        System.out.println("Today I went to"+ place + " with my" + animal1);
        System.out.println("Suddenly, a"+ adjective1 + person + " started to"+verb);
        System.out.println("Everyone looked at the" + color + object +" in suprise.");
        System.out.println("Then my" + animal2 + " shouted," + funnyExclamation + "!" );
        System.out.println("It was the" + adjective2 + " day of my life!");




        scanner.close();

    }
}
