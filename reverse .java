
package palindrome;

import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        
        System.out.println("enter the string");
        Scanner in=new Scanner(System.in);
       String s1=in.nextLine();
       String s2= new StringBuffer(s1).reverse().toString();
        System.out.println(""+s2);
        
    }
}
