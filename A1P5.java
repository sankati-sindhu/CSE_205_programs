/*==============================Problem Statement==============================*/
/**
 *  Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
 */
/*==================================Solution==================================*/
import java.util.Scanner;

public class A1P5 {
        public static void main(final String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int[] arr = new int[n];
        int max = myObj.nextInt(), min = max;
        int max2 = max , min2 = max;
    
        for(int i=1;i<n;i++){
            arr[i] =  myObj.nextInt();
            if(max<arr[i]){
                max2 = max;
                max = arr[i];
            }else if(max2< arr[i] || max2 == max){
                max2 = arr[i];
            }
            if(min>arr[i]) {
                min2 = min;
                min = arr[i];
            }else if(min2>arr[i] || min2 == min){
                min2 = arr[i];
            }
        }
        myObj.close();
        System.out.println("Maximum "+max);
        System.out.println("Minimum "+min);
        System.out.println("Second Maximum "+max2);
        System.out.println("Second Minimum "+min2);

        

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