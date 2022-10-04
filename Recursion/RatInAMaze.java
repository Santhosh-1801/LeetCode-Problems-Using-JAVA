import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) 
	{
	   int n=4;
	   int a[][]={
	       {1,0,0,0},
	       {1,1,0,1},
	       {1,1,0,0},
	       {0,1,1,1}
	   };
	   ArrayList<String> ans=findPaths(a,n);
	   System.out.print(ans);
	   
	}
	static ArrayList<String> findPaths(int a[][],int n)
	{
	    int vis[][]=new int[n][n];
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            vis[i][j]=0;
	        }
	    }
	    ArrayList<String> ans=new ArrayList<>();
	    if(a[0][0]==1){
	        solve(0,0,a,n,ans,"",vis);
	    }
	    return ans;
	}
	static void solve(int i,int j,int a[][],int n,ArrayList<String>ans,String resultant,int vis[][])
	{
	    if(i==n-1&&j==n-1)
	    {
	        ans.add(resultant);
	        return ;
	    }
	    if(i+1<n &&vis[i+1][j]==0&&a[i+1][j]==1)
	    {
	        vis[i][j]=1;
	        solve(i+1,j,a,n,ans,resultant+'D',vis);
	        vis[i][j]=0;
	    }
	    if(j-1>=0 &&vis[i][j-1]==0&&a[i][j-1]==1)
	    {
	        vis[i][j]=1;
	        solve(i,j-1,a,n,ans,resultant+'L',vis);
	        vis[i][j]=0;
	    }
	    if(j+1<n &&vis[i][j+1]==0&&a[i][j+1]==1)
	    {
	        vis[i][j]=1;
	        solve(i,j+1,a,n,ans,resultant+'R',vis);
	        vis[i][j]=0;
	    }
	    if(i-1>=0 &&vis[i-1][j]==0&&a[i-1][j]==1)
	    {
	        vis[i][j]=1;
	        solve(i-1,j,a,n,ans,resultant+'U',vis);
	        vis[i][j]=0;
	    }
	}
}

