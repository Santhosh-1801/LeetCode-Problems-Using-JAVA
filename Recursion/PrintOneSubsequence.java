import java.io.*;
import java.util.*;
public class Main
{
    static boolean printSubsequence(int[] arr, int indx, ArrayList<Integer> d,int sum,int target)
    {
        
        if(indx==arr.length)
        {
                if(sum==target)
                {
                System.out.print(d);
                return true;
                }
                return false;
        }
        d.add(arr[indx]);
        sum=sum+arr[indx];
        if(printSubsequence(arr, indx+1, d,sum,target)==true)
        {
            return true;
        }
        d.remove(d.size()-1);
        sum=sum-arr[indx];
         if(printSubsequence(arr, indx+1, d,sum,target)==true)
        {
            return true;
        }
        return false;

    }
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int arr[]={1,20,10};
    ArrayList<Integer> d= new ArrayList<>();
    boolean s=printSubsequence(arr, 0, d,0,2);
    if(s==false)
    {
        System.out.print("Sorry the sum was not equal");
    }

    }
}
