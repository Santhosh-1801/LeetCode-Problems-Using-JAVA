import java.io.*;
import java.util.*;
public class Main 
{
    static void printSubsequence(int[] arr, int indx, ArrayList<Integer> d)
    {
        
        if(indx==arr.length)
        {
                System.out.print(d);
                return ;
        }
        d.add(arr[indx]);
        printSubsequence(arr, indx+1, d);  
        d.remove(d.size()-1);
        printSubsequence(arr, indx+1, d);

    }
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int arr[]={1,2,3};
    ArrayList<Integer> d= new ArrayList<>();
    printSubsequence(arr, 0, d);

    }
}
