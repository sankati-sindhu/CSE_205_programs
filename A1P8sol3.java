/*==============================Problem Statement==============================*/
/**
 *   Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.
 */

/*==================================Solution==================================*/
import java.util.Scanner;

class A1P8sol3{
        public static void main(final String[] args) {
            final Scanner myObj = new Scanner(System.in);
            int n = myObj.nextInt();
            int[] arr = new int[n];
            int index6 = -1, index7 = -1;

            for (int i = 0; i < n; i++) {
                arr[i] = myObj.nextInt();
            }
			for(int i=0;i<n;i++){
				if(arr[i] == 6){
					index6 = i;
					break;
				}
					
			}
			for(int i=n-1;i>=0;i--){
				if(arr[i] == 7)
				{
					index7 = i;
					break;
				}	
			}
			//System.out.println(index6+" "+ index7);
			int sum = 0;
			if(index6 < index7 && index6 != -1 && index7 != -1){
				for(int i =0;i<index6;i++){
					sum+=arr[i];
				}for(int i = index7+1;i<n;i++){
					sum+=arr[i];
				}
				
			}else{
				//for(int i =0;i<n;i++)
				for(int i: arr){
					sum += i;
				}

			}
			System.out.println(sum);

            
            
            myObj.close();

        }
    
}

/*===================================Sample Output===================================*/
/*
$ java A1P8.java
7
10 3 6 1 2 7 9
Sum 22
 */

