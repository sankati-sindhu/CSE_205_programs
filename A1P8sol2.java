/*==============================Problem Statement==============================*/
/**
 *   Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.
 */

/*==================================Solution==================================*/
//import java.util.Scanner;

public class A1P8sol2 {
        public static void main(final String[] args) {
            //final Scanner myObj = new Scanner(System.in);
            //int n = myObj.nextInt();
            //int[] arr = new int[n];
            int []n = {10,3,6,1,2,7,9};
            int sum = 0;
            int sum6 = 0;

            for(int i = 0; i<n.length ;i++){
                if(n[i] == 6 || sum6 != 0){
                    sum6 += n[i];
                }
                else{
                    sum += n[i];
                }

                if(n[i] == 7){
                    sum6 = 0;
                }
            }
            sum+=sum6;
            System.out.println(sum);
            //myObj.close();

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

