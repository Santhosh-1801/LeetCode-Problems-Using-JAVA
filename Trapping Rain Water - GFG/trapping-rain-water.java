//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        
        long[] leftH=new long[arr.length];
        long[] rightH=new long[arr.length];
        long maxH=-1,total=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maxH)
            {
                maxH=arr[i];
            }
            leftH[i]=maxH;
        }
        maxH=-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>maxH)
            {
                maxH=arr[i];
            }
            rightH[i]=maxH;
        }
        for(int i=0;i<arr.length;i++)
        {
            total+=Math.min(leftH[i],rightH[i])-arr[i];
        }
        return total;
        // Your code here
    } 
}


