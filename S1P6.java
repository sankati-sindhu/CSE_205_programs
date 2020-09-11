/*==============================Problem Statement==============================*/
/**
 * Given 2 strings, a and b, return a new string of the form short+long+short, 
 * with the shorter string on the outside and the longer string on the inside.
 * 
/*==================================Solution==================================*/
import java.util.Scanner;
public class S1P6 {
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);
        final String string = myObj.nextLine();
        final String string2 = myObj.nextLine();

        System.out.println(shortLongShort(string,string2));
        myObj.close();

    }

    public static String shortLongShort( String a, String b){
        if(a.length() < b.length()){
            return a+b+a;
        }
        return b+a+b;

    }
    
    
}


/*===================================Sample Output===================================*/
/*
hi      
hello
hihellohi
 */