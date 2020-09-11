/*==============================Problem Statement==============================*/
/**
 *  Write a program to initialize an integer array and find the maximum and minimum value of the array.
 */
/*==================================Solution==================================*/
import java.util.Scanner;

public class A1P2 {
        public static void main(final String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int[] arr = new int[n];
        int max = myObj.nextInt(), min = max;
       
        //Math.max(arr);
        //Math.min(arr);
        for(int i=1;i<n;i++){
            arr[i] =  myObj.nextInt();
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        myObj.close();
        System.out.println("Maximum "+max);
        System.out.println("Minimum "+min);

        

    }
}
/*===================================Sample Output===================================*/
/*
10
2 1 4 5 7 0 8 9 6 3
Maximum 9
Minimum 0
 */