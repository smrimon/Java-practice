
package basicjava;

import java.util.Scanner;

public class CheckVowelConsonant {
    
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    char ch;
    System.out.print("Enter any letter: ");
    ch = input.next().charAt(0);
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        System.out.println("vowel");
    }
    else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
        System.out.println("vowel");
    }
    else{
        System.out.println("consonant");
    }
   }
}
