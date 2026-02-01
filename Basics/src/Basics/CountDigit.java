package Basics;

import java.util.Scanner;
//PROGRAM TO COUNT DIGITS OF A NUMBER
public class CountDigit {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n =  sc.nextInt();

        int result = countNum(n);
        System.out.println("The count is:" + result);

    }
    static  int countNum(int num){
        int count =0;
        while(num>0){
            count++;
            num/=10;

        }
        return count;
    }
}

