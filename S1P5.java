/*==============================Problem Statement==============================*/
/**
 *      Write a java program that will return the first half of the string, 
 *      if the length of the string is even. It should return null for odd length string.

/*==================================Solution==================================*/
import java.util.Scanner;
public class S1P5 {
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);
        final String string = myObj.nextLine();
        System.out.println(no1Last(string));
        myObj.close();

    }

    public static String no1Last( String a){
        if(a.length() <= 1){
            return " ";
        }
        return a.substring(1, a.length()-1);

    }
    
    
}


/*===================================Sample Output===================================*/
/*
Suman
uma
 */