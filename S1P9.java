/*==============================Problem Statement==============================*/
/**
 * Given two strings, a and b, print a new string which is made of the following
 * combination-first character of a, the first character of b, second character of
 * a,second character of b and so on. Any characters left, will go to the end of the
 *  result.


 * 
/*==================================Solution==================================*/
import java.util.Scanner;
public class S1P9 {
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);
        final String string = myObj.nextLine();
        final String string2 = myObj.nextLine();
        System.out.println(shortLongShort(string, string2));
        myObj.close();

    }

    public static String shortLongShort( String a, String b){
        String newString = ""; int i, n;
        if(a.length()<b.length()){
            n =a.length();
        }else{
            n = b.length();
        }
        for(i =0;i<n;i++){
            newString+=a.substring(i, i+1);
            newString+=b.substring(i, i+1);

        }
        for(;i<a.length();i++){
            newString+=b.substring(i, i+1);
        }
        for(;i<b.length();i++){
            newString+=b.substring(i, i+1);
        }
       
        return newString;
    }
    
    
}


/*===================================Sample Output===================================*/
/*
hello
world
hweolrllod
 */