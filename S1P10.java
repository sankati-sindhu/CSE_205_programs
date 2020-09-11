/*==============================Problem Statement==============================*/
/**
 *  Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. 
You may assume that n is between 0 and the length of the string, inclusive. 


/*==================================Solution==================================*/
import java.util.Scanner;
public class S1P10 {
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);
        String strings = myObj.nextLine();
        String [] string = strings.split(",");
        int n = Integer.parseInt(string[1]);
        if(string[0].length() >= n){
            String str2 = string[0].substring(string[0].length()-n ,string[0].length());
            System.out.println(str2.repeat(n));
        }

        myObj.close();

    }
    
    
}


/*===================================Sample Output===================================*/
/*
Wipro
WiWiWiWiWi
 */