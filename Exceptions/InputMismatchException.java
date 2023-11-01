import java.util.*;

public class Main
{
	public static void main(String[] args) {
	 System.out.print(getTheValue());
	}
	static int getTheValue()
	{
	    try
	    {
	        Scanner sc=new Scanner(System.in);
	        return sc.nextInt();
	    }
	    catch(Exception e){
	        System.out.println(e);
	        return 0;
	    }
	}
}
