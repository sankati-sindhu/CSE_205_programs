/*==============================Problem Statement==============================*/
/**
 *    Write a program to reverse the elements of a given 2*2 array. 
 *    Four integer numbers needs to be passed as Command Line arguments.
 */

/*==================================Solution==================================*/
import java.util.Scanner;
public class A1P10 {
        public static void main(final String[] args) {
            final Scanner myObj = new Scanner(System.in);
            String numbers = myObj.nextLine();
            String[] nums = numbers.split(" ");
            if(nums.length < 9){
                System.out.println("Please enter 9 integer numbers");
            }else{
                int[][] array = new int[3][3];
                int k = 0;
                System.out.println("The given array is :");
                for(int i = 0;i<3;i++){
                    for(int j=0; j<3;j++){
                        array[i][j] = Integer.parseInt(nums[k]);
                        k++;
                        System.out.print(array[i][j]+" "); 
                    }
                    System.out.println();
                }
                
                int max = array[0][0];
                for(int i = 0;i<3;i++){
                    for(int j=0; j<3;j++){
                        if(max<array[i][j]){
                            max = array[i][j];
                        }
                    }
                }

                System.out.println("The biggest number in the given array is "+max);

            }
            
            myObj.close();

        }
    
}

/*===================================Sample Output===================================*/
/*
1 23 45 55 121 222 56 77 89
The given array is :
1 23 45 
55 121 222 
56 77 89 
The biggest number in the given array is 222
 */