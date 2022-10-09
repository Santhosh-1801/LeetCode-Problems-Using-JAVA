/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args) 
	{
		int height[]={30,10,60 , 10 , 60 , 50};
		int n=height.length;
		int dp[]=new int[height.length];
		Arrays.fill(dp,-1);
		System.out.print(solve(n-1,height,dp,3));
	}
	static int solve(int index,int height[],int dp[],int k)
	{
	    if(index==0)
	    {
	        return 0;
	    }
	    if(dp[index]!=-1)
	    {
	        return dp[index];
	    }
	    int minSteps=Integer.MAX_VALUE;
	    for(int i=1;i<=k;i++)
	    {
	        if(index-i>=0)
	        {
	            int jump=solve(index-i,height,dp,k)+Math.abs(height[index]-height[index-i]);
	            minSteps=Math.min(minSteps,jump);
	        }
	    }
	    return dp[index]=minSteps;
	}
}
