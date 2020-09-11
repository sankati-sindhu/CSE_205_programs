/*==============================Problem Statement==============================*/
/**
 *   Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.
 */

/*==================================Solution==================================*/
import java.util.Scanner;

public class A1P8 {
        public static void main(final String[] args) {
            final Scanner myObj = new Scanner(System.in);
            int n = myObj.nextInt();
            int[] arr = new int[n];
            int index6 = -1, index7 = -1;

            for (int i = 0; i < n; i++) {
                arr[i] = myObj.nextInt();
            }

            if(arr[0] == 6){index6 =0;}
            if(arr[0]== 7){index7 = 0;}

            for(int i =1;i<n;i++){

                if(arr[i] == 6 && index6 == -1){ index6 =i; }
                if(arr[i]== 7){ index7 = i; }

                arr[i] += arr[i-1];
            }
    
            if(index6!= -1 && index7 != -1){
                if(index6 == 0){
                    System.out.println(arr[n-1] - arr[index7]);
                }else{
                    System.out.println(arr[n-1] - arr[index7] + arr[index6 - 1]);
                }
               
            }else{
                System.out.println(arr[n-1]);
            }
            
            myObj.close();

        }
    
}

/*===================================Sample Output===================================*/
/*
$ java A1P8.java
7
10 3 6 1 2 7 9
Sum 22


1 2 3 6 2 3 5 7 2

 */

