
package basicjava;

import java.util.Scanner;

public class AssignmentDemo {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int x, y;
        
        System.out.print("Enter first number: ");
        x = input.nextInt();
        
        System.out.print("Enter second number: ");
        y = input.nextInt();
        
        x+=y;
        System.out.println("x= "+x);
        
        x-=y;
        System.out.println("x= "+x);
        
        x*=y;
        System.out.println("x= "+x);
        
        x/=y;
        System.out.println("x= "+x);
        
        x%=y;
        System.out.println("x= "+x);
    }
}
