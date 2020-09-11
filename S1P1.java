/*==============================Problem Statement==============================*/
/**
 *     Write a Program to check whether a given String is Palindrome or not.
 *
/*==================================Solution==================================*/
import java.util.Scanner;
public class S1P1 {
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);
        final String number = myObj.nextLine();
        if(isPallindrome(number)) {
            System.out.print("pallindrome");
         }else{
            System.out.print("nope not a pallindrome"); 
            }
        myObj.close();
        /*
         * if(number == number.reverse()){ System.out.print("pallindrome"); }else{
         * System.out.print("nope not a pallindrome"); }
         */

    }

    public static Boolean isPallindrome(String s) {

        for (int i = 0, j=s.length() -1; i< j ; i++, j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        } 
        return true;

    }
    
}

/*===================================Sample Output===================================*/
/*
1234567
nope not a pallindrome
 */