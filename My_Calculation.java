
package oop_concept;

public class My_Calculation extends Calculation {

    
    public static void main(String args[]) {
        int a = 56, b = 49;
        My_Calculation demo = new My_Calculation();
        demo.addition(a, b);
        demo.subtraction(a, b);
        demo.multiplication(a, b);
    }
}
