/*==============================Problem Statement==============================*/
/**
 *  Given a string, if the first or last chars are 'x', return the string without
 *  those 'x' chars, otherwise return the string unchanged. 

 * 
/*==================================Solution==================================*/
import java.util.Scanner;
public class S1P7 {
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);
        final String string = myObj.nextLine();


        System.out.println(shortLongShort(string));
        myObj.close();

    }

    public static String shortLongShort( String a){
        if(a.charAt(0) == 'x' && a.charAt(a.length()-1) == 'x' ){
            return a.substring(1, a.length()-1);
        }
        return a;

    }
    
    
}


/*===================================Sample Output===================================*/
/*
xHix
Hi
 */