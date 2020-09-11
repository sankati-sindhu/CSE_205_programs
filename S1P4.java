/*==============================Problem Statement==============================*/
/**
 *      Write a java program that will return the first half of the string, 
 *      if the length of the string is even. It should return null for odd length string.

/*==================================Solution==================================*/
import java.util.Scanner;
public class S1P4 {
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);
        final String string = myObj.nextLine();
        System.out.println(halfString(string));
        myObj.close();

    }

    public static String halfString( String a){
        if(a.length()%2 == 0)
            return a.substring(0, a.length()/2);
        else return null;

    }
    
    
}


/*===================================Sample Output===================================*/
/*
TomCat
Tom
 */