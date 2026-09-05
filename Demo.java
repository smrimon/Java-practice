/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KHAN GADGET
 */
class Demo {
    static int count = 0;
    int id;
    final double PI = 3.1416;
    Demo(int id){
        this.id = id;
        count++;
    }
    void show(){
        System.out.println("Id: "+id);
        System.out.println("PI value: "+PI);
    }
    static void displayCount(){
        System.out.println("Total count: "+count);
    }
    final void massage(){
        System.out.println("This is the final method.");
    }
}
