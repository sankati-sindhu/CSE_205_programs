/*==============================Problem Statement==============================*/
/**
 *  Write a program to initialize an array and print them in a sorted order.
 */

/*==================================Solution==================================*/
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class A1P7 {
        public static void main(final String[] args) {
            final Scanner myObj = new Scanner(System.in);
            final int n = myObj.nextInt();
            final Set<Integer> set = new HashSet<Integer>();
            final int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = myObj.nextInt();
            }
            for (int i = 0; i < n; i++) {
                set.add(arr[i]);
            }
            final Iterator<Integer> it = set.iterator();
            int i = 0;
            while(it.hasNext()){
                arr[i] =  (int) it.next();
                System.out.print(arr[i] + " ");
            }
        myObj.close();

    }
    
}

/*===================================Sample Output===================================*/
/*
10
1 2 3 1 2 3 1 2 3 4
1 2 3 4
 */