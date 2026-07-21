package day02;

import java.util.Scanner;

public class userinput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your cgpa: ");
        double cgpa = scanner.nextDouble();
        System.out.print("are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();


        System.out.println("Hello" + name);
        System.out.println("you are" + age + "years old.");
        System.out.println("your cgpa is " + cgpa);
        System.out.println("you are a student" + isStudent);

        scanner.close();

    }
}
