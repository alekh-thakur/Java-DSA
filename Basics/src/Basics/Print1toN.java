package Basics;

import java.util.Scanner;

//PROGRAM TO PRINT NUMBERS FROM 1 TO N
public class Print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
