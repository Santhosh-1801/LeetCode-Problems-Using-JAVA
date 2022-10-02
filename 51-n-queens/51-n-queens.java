class Solution {
    public List<List<String>> solveNQueens(int n) {
        char a[][]=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]='.';
            }
        }
        List<List<String>> tot=new ArrayList<List<String>>();
        totsearch(tot,n,a,0);
        return tot;
        
    }
    public boolean checking(char a[][],int j,int col)
    {
        int rowss=j;
        int colss=col;
        for(int p=j,q=col;p>=0&&q>=0;p--,q--)
        {
            if(a[p][q]=='Q')
            {
                return false;
            }
        }
        j=rowss;
        col=colss;
        for(int s=col;s>=0;s--)
        {
            if(a[j][s]=='Q')
            {
                return false;
            }
        }
        for(int p=j,q=col;p<=a.length-1&&q>=0;p++,q--)
        {
            if(a[p][q]=='Q')
            {
                return false;
            }
        }
        return true;
        
    }
    public void totsearch(List<List<String>> tot,int n,char a[][],int col)
    {
        if(col==n)
        {
            tot.add(constructing(a));
            return ;
        }
        for(int j=0;j<a.length;j++)
        {
            if(checking(a,j,col)==true)
            {
                a[j][col]='Q';
                totsearch(tot,n,a,col+1);
                a[j][col]='.';
            }
        }
    }
    public List<String> constructing(char a[][])
    {
        List<String> resultant1=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            String m1=new String(a[i]);
            resultant1.add(m1);
        }
        return resultant1;
    }
}