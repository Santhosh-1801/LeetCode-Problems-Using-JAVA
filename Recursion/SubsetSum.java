import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int a[]=new int[number];
		for(int i=0;i<number;i++)
		{
		    a[i]=sc.nextInt();
		}
		ArrayList<Integer> l1=new ArrayList<>();
		ArrayList<Integer> l2=new ArrayList<>();
		subsetSum(0,a,0,l1,l2);
		Collections.sort(l2);
		System.out.print(l2);
		
		
	}
	static void subsetSum(int index,int arr[],int sum,ArrayList<Integer> l1,ArrayList<Integer> l2)
	{
	    if(index==arr.length)
	    {
	        System.out.print(sum+" ");
	        l2.add(sum);
	        return ;
	    }
	    l1.add(arr[index]);
	    sum=sum+arr[index];
	    subsetSum(index+1,arr,sum,l1,l2);
	    sum=sum-arr[index];
	    l1.remove(l1.size()-1);
	    subsetSum(index+1,arr,sum,l1,l2);
	    
	}
}
