
package basicjava;

import java.util.Scanner;

public class MathClassDemo {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Enter two numbers: ");
        a = input.nextInt();
        b = input.nextInt();
        
        System.out.println("Maximum number: "+Math.max(a, b));
        System.out.println("Minimum number: "+Math.min(a, b));
    }

}
