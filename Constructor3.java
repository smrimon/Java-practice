
package oop_concept;


public class Constructor3 {
    int num1;
    int num2;
    Constructor3(){
        num1 = 475;
        num2 = 8746;
    }

    public static void main(String args[]) {
        Constructor3 obj = new Constructor3();
        System.out.println("Number 1= "+obj.num1);
        System.out.println("Number 2= "+obj.num2);
    }
}
