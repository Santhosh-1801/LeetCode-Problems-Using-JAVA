class Solution {
    public int pivotInteger(int n) {
        
      for(int i=1;i<=n;i++)
      {
          boolean checking=pivotCh(i,n);
          if(checking==true)
          {
              return i;
          }
      }
      return -1;
        
    }
    public boolean pivotCh(int i,int n){
          int sum=0,sumA=0;
          for(int j=1;j<=i;j++)
          {
              sum=sum+j;
          }
          for(int y=i;y<=n;y++)
          {
              sumA=sumA+y;
          }
          return sum==sumA;
    }
}