import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int originalVal = n;
        int rev = 0;
        while(n>0){
            int digit = n%10;
            rev=rev*10+digit;
            n/=10;
        }
        if (originalVal== rev){
            System.out.println("The number is palindrome");
        }
        else {
            System.out.println("The number is not palindrome");

        }
        System.out.println(rev);
    }
}