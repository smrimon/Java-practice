
package basicjava;

import java.util.Scanner;

public class UnaryDemoIncreamentDecreament1 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("Enter number: ");
        x = input.nextInt();
        
        y = ++x;
        System.out.println("y = "+y);
        y = x;
        System.out.println("y = "+y);
        y = x++;
        System.out.println("y = "+y);
        y = x;
        System.out.println("y = "+y);
    }
}
