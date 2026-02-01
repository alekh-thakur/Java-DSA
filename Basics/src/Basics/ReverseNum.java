package Basics;

import java.util.Scanner;
//PROGRAM TO REVERSE A NUMBER
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while (n>0){
            int digits =  n%10;
            rev = rev *10 + digits;
            n/=10;
        }
        System.out.println("the reversed num is:" + rev);

    }
}
