package Basics;

import java.util.Scanner;
//PROGRAM TO PRINT NUMBERS FROM N TO 1
public class PrintNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num:");
        int n = sc.nextInt();

        for(int i=n;i>=1;i--){
            System.out.println(i);
        }

    }
}
