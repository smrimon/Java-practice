
package oop_concept;


public class Classes_and_Objects1 {

    String name;
    String breed;
    int age;
    String color;
    public Classes_and_Objects1(String name, String breed, int age, String color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
    public String toString(){
        return "Name is: "+name+" "+"Breed, age and color is: "+breed+" "+age+" "+color;
    }
    
    
    public static void main(String args[]) {
        Classes_and_Objects1 Tom = new Classes_and_Objects1("Tom", "Pappilon", 6, "Black");
        System.out.println(Tom);
    }
}
