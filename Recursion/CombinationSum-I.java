import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l1=new ArrayList<>();
		ArrayList<ArrayList<Integer>> l2=new ArrayList<>();
		int a[]={2,3,6,7};
		combinationSum(a,7,l1,l2,0);
		System.out.print(l2);
	}
	static void combinationSum(int a[],int target,ArrayList<Integer>l1,ArrayList<ArrayList<Integer>>l2,int index)
	{
	    if(index==a.length)
	    {
	        if(target==0)
	        {
	        l2.add(new ArrayList<>(l1));
	        }
	        return ;
	        
	    }
	    else if(a[index]<=target)
	    {
	        l1.add(a[index]);
	        combinationSum(a,target-a[index],l1,l2,index);
	        l1.remove(l1.size()-1);
	        
	    }
	    
	    combinationSum(a,target,l1,l2,index+1);
	    
	}
}
