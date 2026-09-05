
package basicjava;

import java.util.Scanner;

public class MultiplicationTableDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n = input.nextInt();
        for(int i=1; i<=10; i++){
        System.out.println(n+"*"+i+"="+n*i);
    }
    }
}
