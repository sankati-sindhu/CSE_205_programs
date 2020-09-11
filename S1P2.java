/*==============================Problem Statement==============================*/
/**
 *     Write a Program to check whether a given String is Palindrome or not.

/*==================================Solution==================================*/
import java.util.Scanner;
public class S1P2 {
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);
        final String[] strings = myObj.nextLine().toLowerCase().split(",");
        System.out.println(conCat(strings[0], strings[1]));

        myObj.close();

    }
    
    public static String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0)
            return a+b;
        if ((a.substring(a.length() - 1, a.length())).equals(b.substring(0,1)))
            return a + b.substring(1,b.length());
        else
            return a+" "+b;

    }
    
}


/*===================================Sample Output===================================*/
/*
Mark,kate
markate
 */