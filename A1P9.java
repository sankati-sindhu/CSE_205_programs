/*==============================Problem Statement==============================*/
/**
 *    Write a program to reverse the elements of a given 2*2 array. 
 *    Four integer numbers needs to be passed as Command Line arguments.
 */

/*==================================Solution==================================*/
import java.util.Scanner;
public class A1P9 {
        public static void main(final String[] args) {
            final Scanner myObj = new Scanner(System.in);
            String numbers = myObj.nextLine();
            String[] nums = numbers.split(" ");
            if(nums.length < 4){
                System.out.println("Please enter 4 integer numbers");
            }else{
                int[][] array = new int[2][2];
                int k = 0;
                System.out.println("The given array is :");

                for(int i = 0;i<2;i++){
                    for(int j=0; j<2;j++){
                        array[i][j] = Integer.parseInt(nums[k]);
                        k++;
                        System.out.print(array[i][j]+" "); 
                    }
                    System.out.println();
                }
                for(int i = 0, irev = 1;i<irev;i++,irev--){
                    for(int j=0, jrev = 1; j<jrev;j++, jrev--){
        
                        int temp = array[i][j];
                        array[i][j] = array[irev][jrev];
                        array[irev][jrev] = temp;
                    }
                   
                }
                System.out.println("The reverse of the array is :");
                for(int i = 0;i<2;i++){
                    for(int j=0; j<2;j++){
                        System.out.print(array[i][j]+" "); 
                    }
                    System.out.println();
                }

            }
            
            myObj.close();

        }
    
}

/*===================================Sample Output===================================*/
/*
1 2 3 4
The given array is :
1 2 
3 4 
The reverse of the array is :
4 2 
3 1 
 */