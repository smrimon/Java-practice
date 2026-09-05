
package oop_concept;

public class Abstract1{
    public static void main(String[] args){      
       TV remote = new TVRemote();  
       remote.turnOn();   
       remote.turnOff();

       remote.implementedMethod();
    }
}
abstract class TV{
    abstract void turnOn();
    abstract void turnOff();
    void implementedMethod()
    {
    System.out.println("directly printing from abstract class method");
    }
}
class TVRemote extends TV{
    void turnOn(){    
        System.out.println("TV is turned ON.");
    } 
    void turnOff(){  
        System.out.println("TV is turned OFF.");
    }
}
