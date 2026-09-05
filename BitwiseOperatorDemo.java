package basicjava;

import java.util.Scanner;

public class BitwiseOperatorDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Enter two numbers: ");
        a = input.nextInt();
        b = input.nextInt();
        
        int c = a&b;
        System.out.println("a & b = "+c);
        int c1 = a|b;
        System.out.println("a | b = "+c1);
        int c2 = a^b;
        System.out.println("a ^ b = "+c2);
        int c3 = a>>b;
        System.out.println("a >> b = "+c3);
        int c4 = a<<b;
        System.out.println("a << b = "+c4);
    }
}
