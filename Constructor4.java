
package oop_concept;

public class Constructor4 {
    int num1;
    int num2;
    
    Constructor4(int a, int b){
        num1 = a;
        num2 = b;
    }
    public static void main(String args[]) {
        Constructor4 obj1 = new Constructor4(58, 56);
        Constructor4 obj2 = new Constructor4(768, 76);
        
        System.out.println("Number 1 = "+obj1.num1);
        System.out.println("Number 2 = "+obj1.num2);
        
        System.out.println("Number 1 = "+obj2.num1);
        System.out.println("Number 2 = "+obj2.num2);
    }
}
