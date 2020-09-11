/*==============================Problem Statement==============================*/
/** 
 * Write a Java program that accepts a string (with * in it). The program should 
 * return a new string in which the following characters are removed-*,the 
 * characters that are to the left and right of *
 * 
/*==================================Solution==================================*/
import java.util.Scanner;
public class S1P8 {
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);
        final String string = myObj.nextLine();
        String[] strings = string.split("\\*");
        System.out.println(strings.length);
        String newString;
        if(strings.length > 1){
            if(strings[0].length() >= 1)
                newString= strings[0].substring(0, strings[0].length() -1);
            else{
                newString = "";
            }
            for(int i = 1;i<strings.length-1;i++){
                if(strings[i].length() > 2){
                    newString += strings[i].substring(1, strings[i].length() -1);
                }
            }
            if(strings[strings.length-1].length() >= 1)
                newString += strings[strings.length-1].substring(1, strings[strings.length-1].length());
        }
        else{
            newString = string;
        }
        System.out.println(newString);
        myObj.close();

    }
}

