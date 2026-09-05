/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KHAN GADGET
 */
public class Test {
      public static void main(String[] args)
      {
          Shape s1 = new Circle("Red", 2.2);
          Shape s2 = new Rectangle("Yellow", 2, 4);

          System.out.println(s1.toString());
          System.out.println(s2.toString());
      }
 }
 abstract class Shape{
     String color;
     abstract double area();
     public abstract String toString();
     public Shape(String color){
         System.out.println("Abstract Shape constructor called");
         this.color = color;
     }
     public String getColor(){
         return color;
     }
 }
 class Circle extends Shape{
     double radius;
     public Circle(String color, double radius){
         // calling Shape constructor
         super(color);
         this.radius = radius;
         System.out.println("Circle constructor called");
     }
     double area(){
         return Math.PI * Math.pow(radius, 2);
     }
     public String toString(){
         return "Circle color is " + super.getColor()
             + " and area is : " + area();
     }
 }
 class Rectangle extends Shape{
     double length;
     double width;
     public Rectangle(String color, double length,
                       double width)
     {
         // calling Shape constructor
         super(color);
         this.length = length;
         this.width = width;
         System.out.println("Rectangle constructor called");
     }
     double area(){ return length * width; }
     public String toString()
     {
         return "Rectangle color is " + super.getColor()
                + " and area is : " + area();
     }
 }