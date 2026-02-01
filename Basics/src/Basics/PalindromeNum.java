package Basics;

import java.util.Scanner;
//PROGRAM TO CHECK A  NUMBER IS A PALINDROME OR NOT
public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int originalVal = n;
        int rev =0;
        while(n>0){
            int digits =  n %10;
            rev = rev*10 + digits;
            n/=10;
        }
        if(rev==originalVal){
            System.out.println("The number is palindrome");
        }
        else {
            System.out.println("The number is not palindrome");
        }
    }
}
