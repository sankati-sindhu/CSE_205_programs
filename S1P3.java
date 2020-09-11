/*==============================Problem Statement==============================*/
/**
 *      Given a string, return a new string made of 'n' copies of the first 2 chars of the original 
 *      string where 'n' is the length of the string.

/*==================================Solution==================================*/
import java.util.Scanner;
public class S1P3 {
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);
        final String string = myObj.nextLine();
        if(string.length() >= 2){
            String str2 = string.substring(0, 2);
            System.out.println(str2.repeat(string.length()));
        }

        myObj.close();

    }
    
    
}


/*===================================Sample Output===================================*/
/*
Wipro
WiWiWiWiWi
 */