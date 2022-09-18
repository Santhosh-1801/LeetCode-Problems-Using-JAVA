
import java.io.*;
import java.util.*;
public class Main 
{
    static void printSubsequence(int[] arr, int indx, ArrayList<Integer> d,int sum,int target)
    {
        
        if(indx==arr.length)
        {
                if(sum==target)
                {
                System.out.print(d);
                }
                return ;
        }
        d.add(arr[indx]);
        sum=sum+arr[indx];
        printSubsequence(arr, indx+1, d,sum,target);  
        d.remove(d.size()-1);
        sum=sum-arr[indx];
        printSubsequence(arr, indx+1, d,sum,target);

    }
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int arr[]={1,2,1};
    ArrayList<Integer> d= new ArrayList<>();
    printSubsequence(arr, 0, d,0,2);

    }
}
