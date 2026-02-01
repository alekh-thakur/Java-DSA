package Basics;

import java.util.Scanner;
//Program to check a number is prime or not
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i=2;i<=n;i++){

            if(n%i==0){
                isPrime = false;
            }
        }
        if(!isPrime){
            System.out.println("The number is not prime");
        }
        else{
            System.out.println("The number is prime");

        }

    }
}
