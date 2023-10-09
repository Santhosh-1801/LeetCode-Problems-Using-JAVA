

import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int largest=a[0];
		int secondl=-1;
		for(int i=1;i<a.length;i++)
		{
		    if(a[i]>largest)
		    {
		        secondl=largest;
		        largest=a[i];
		    }
		    else if(secondl>a[i] && a[i]!=largest)
		    {
		        secondl=a[i];
		    }
		}
		System.out.println(Arrays.toString(a));
		System.out.println(largest);
		System.out.println(secondl);
		
	}
}
