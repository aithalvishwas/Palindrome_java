package NumberPalindrome;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("What is your number? ");
        int number=sc.nextInt();
        int reverse=0;
        number=Math.abs(number);
        int num=Math.abs(number);
        while(num>0){
            int lastdigit=num%10;
            reverse=(reverse*10)+lastdigit;
            num=num/10;
        }
        if(number!=reverse){
            System.out.println("It is not Palindrome");
        }else{
            System.out.println("It is Palindrome");
        }
    }
}
