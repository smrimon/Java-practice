
package oop_concept;


public class Test {
    
    public static void main(String[] args){
        Student s1, s2;
        s1 = new Student();
        s1.name = "Masum Billah";
        s1.id = 1;
        s1.result =  (float) 3.82;
        
        System.out.println("Name: "+s1.name);
        System.out.println("ID: "+s1.id);
        System.out.println("Result: "+s1.result);
        
        s2 = new Student();
        s2.name = "Mezbaul Hoque Mahir";
        s2.id = 28;
        s2.result =  (float) 3.62;
        
        System.out.println("Name: "+s2.name);
        System.out.println("ID: "+s2.id);
        System.out.println("Result: "+s2.result);
                
    }
}
