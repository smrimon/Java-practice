
package oop_concept;

public class Test1 {
    public static void main(String[] args){
        Student1 s1, s2;
        s1 = new Student1();
        s1.name = "Masum Billah";
        s1.id = 1;
        s1.result = (float) 3.82;
        s1.DisplayDetails();
        
        s2 = new Student1();
        s2.name = "Mezbaul Hoque Mahir";
        s2.id = 28;
        s2.result = (float) 3.62;
        s2.DisplayDetails();
    }
}
