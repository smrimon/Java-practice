
package basicjava;

import java.util.Scanner;

public class UnaryDemoIncreamentDecreament {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("Enter number: ");;
        x = input.nextInt();
        
        y = +x;
        System.out.println("Unary plus result: "+y);
        y = -x;
        System.out.println("Unary minus result: "+y);
        y = ++x;
        System.out.println("Pre increament result: "+y);
        y = x++;
        System.out.println("Post increament result: "+y);
        y = --x;
        System.out.println("Pre decreament result: "+y);
        y = x--;
        System.out.println("Post decreament result: "+y);
        
    }
    
}
