/*==============================Problem Statement==============================*/
/**
 *  Write a program to initialize an integer array and print the sum and average of the array.
 */
/*==================================Solution==================================*/
import java.util.Scanner;

public class A1P1 {
        public static void main(final String[] args) {

        //myObj instance for inputting stuff from console(the out output window)
        Scanner myObj = new Scanner(System.in);

        //we are using myObj to read the next integer -->going to be the size of our array in sequence
        //ex: 5, then n=5
        int n = myObj.nextInt();
        
        
        //in java we intialize any new objeccts, in this case arrays using "new"
        //here we are intializing array with n elements
        //exwhen n=5, int[arr] = new int[5], i.e, {0,0,0,0,0};
        int[] arr = new int[n];

        //Since sum before adding any element is going to be nothing,
        //we initalize it with zero
        //if we dont initialze and then use it for updatiom
        //in the sense sum += someVar , sum = sum +var --> will give error
        int sum = 0;
        float avg;
        
        //loop for iteration of the elements
        for(int i=0;i<n;i++){

            //inputting the next int from console
            arr[i] =  myObj.nextInt();

            //we are incrementing the current element into sum
            sum += arr[i];
        }

        //since  we no loger need to input anytu=hing from the system(Console)
        //we close the scanner class
        myObj.close();

        //average formula = sum/no of terms
        avg = sum/(float)n;

        //displaying found sum and average 
        System.out.print("sum"+sum+"\n");
        System.out.print("Average"+avg+"\n");
        

        

    }
}
/*===================================Sample Output===================================*/
/*
5
1 2 3 4 5
sum15
Average3.0
 */