
package oop_concept;

public class SubClass extends SuperClass{
    int num = 10;
    
    public void display(){
        System.out.println("This is the display method of subclass");
    }
    public void my_method(){
        SubClass sub = new SubClass();
        
        sub.display();
        super.display();
        System.out.println("The number is: "+sub.num);
        System.out.println("The number is: "+super.num);
    }
    public static void main(String args[]) {
        SubClass obj = new SubClass();
        obj.my_method();
    }
}
