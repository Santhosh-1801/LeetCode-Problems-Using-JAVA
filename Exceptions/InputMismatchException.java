/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	 System.out.println(getTheValue());
	 System.out.println(getTheCorrect());
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
	static int getTheCorrect(){
	    Scanner sc=new Scanner(System.in);
	    boolean valid=true;
	    System.out.println("Enter an value");
	    String valueget=sc.next();
	    for(int i=0;i<valueget.length();i++)
	    {
	        if(!Character.isDigit(valueget.charAt(i))){
	            valid=false;
	            break;
	        }
	    }
	    if(valid){
	        return Integer.parseInt(valueget);
	    }
	    else{
	        return 0;
	    }
	}
}
