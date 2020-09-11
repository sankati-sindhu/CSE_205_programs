/*==============================Problem Statement==============================*/
/**
 *  Write a program to initialize an array and print them in a sorted order.
 */
/*==================================Solution==================================*/
import java.util.Scanner;
import java.util.Arrays;

public class A1P6 {
        public static void main(final String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] =  myObj.nextInt();
        }
        Arrays.sort(arr, 0, n);
        for(int i: arr){
            System.out.print(i+" ");
        }
        myObj.close();

    }
 
}

/*===================================Sample Output===================================*/
/*
10
0 1 2 3 4 5 6 7 8 9
Maximum 9
Minimum 0
Second Maximum 8
 */