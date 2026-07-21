package day02;

import java.net.PortUnreachableException;

public class arhtematicOperators {
    public static void main(String[] args){
        //ARTHEMATIC OPERATORS

        int x=10;
        int y=2;
        int add;
        int sub;
        int mul;
        int div;
        int mod;

        add=x+y;
        sub=x-y;
        mul=x*y;
        div=x/y;
        mod=x%y;

        System.out.println("Addition :"+ add);
        System.out.println("Subraction :"+ sub);
        System.out.println("Multiplication :"+ mul);
        System.out.println("Quotient :"+ div);
        System.out.println("Modulus :"+ mod);
    }
}
