package day04;
import java.util.Scanner;
public class exrecise02circumferenceareavolume {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double circumference;
        double area;
        double volume;

        double radius;
        System.out.print("Enter the radius:");
        radius=scanner.nextDouble();

        circumference = 2*Math.PI*radius;
        System.out.printf("The circumference is:%.2fcm\n",circumference);

        area = Math.PI * Math.pow(radius,2);
        System.out.printf("The area is:%.2fcm\n",area);

        volume = 4/3 * Math.PI * Math.pow(radius,3);
        System.out.printf("The volume is:%.2fcm^2\n",volume);


        scanner.close();

    }
}
