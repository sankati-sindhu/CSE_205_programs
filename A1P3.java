/*==============================Problem Statement==============================*/
/**
 *  Write a program to initialize an integer array with values and check if a given number is present in the array or not.
 */
/*==================================Solution==================================*/
import java.util.Scanner;

public class A1P3 {
        public static void main(final String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int[] arr = new int[n];
    
        for(int i=0;i<n;i++){
            arr[i] =  myObj.nextInt();
        }
        myObj.close();
        int search = myObj.nextInt();
        
        System.out.print(searchLinear(arr, n, search) + "\n");
    }
    public static int searchLinear(int[] arr, int n, int search) {
        for(int i=0;i<n;i++){
            if(arr[i] == search){
                return i;
            }
        }
        return -1;
    }
}
/*===================================Sample Output===================================*/
/*
5
1 4 34 56 7
56
3
 */