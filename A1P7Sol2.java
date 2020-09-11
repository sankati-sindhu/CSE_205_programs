import java.util.*;
class prgrm7
{	
	public static void main(String Args[])
	{
		int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
      	System.out.println("Enter all the elements:");
       	for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        s.close();  
        Arrays.sort(a);
        int b[] = new int[n];
        int j =0;
		
		for(int i = 0; i < n-1; i++)
        {
			if(a[i+1]!=a[i])
			{
                b[j] = a[i];
                j++;
            	//System.out.println(a[i]);
			}
        }
        b[j] = a[n-1];
        j++;
        //System.out.println(a[n-1]);	

        //for printing
        System.out.println("--After removing Duplicate elements--");
        for(int i = 0; i < j; i++)
        {
            System.out.println(b[i]);
      	}
	}

}