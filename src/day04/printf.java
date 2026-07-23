package day04;

public class printf {
    public static void main(String[] args){
        String name = "sumanth";
        char firstLetter = 'S';
        int age = 19;
        double height = 5.9;
        boolean isEmployed = true;
        System.out.printf("Hello %s\n",name);
        System.out.printf("First letter in your name is: %c\n",firstLetter);
        System.out.printf("Your age is: %d\n",age);
        System.out.printf("Your height is:%fcm\n",height);
        System.out.printf("Employed:%b\n",isEmployed);

    }
}
