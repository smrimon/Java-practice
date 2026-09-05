
package basicjava;

import java.util.Scanner;

public class TraingleAndCircle {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        double base, height, radius, Area1, Area2;
        
        System.out.print("Enter value of base: ");
        base = input.nextDouble();
        
        System.out.print("Enter value of height: ");
        height = input.nextDouble();
        
        System.out.print("Enter value of radius: ");
        radius = input.nextDouble();
        
        Area1 = 0.5*base*height;
        Area2 = 3.1416*radius*radius;
        
        System.out.println("The area of a traingle is "+Area1);
        System.out.println("The area of a circle is "+Area2);
        
    }
}
