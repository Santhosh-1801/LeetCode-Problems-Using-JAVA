public class Main
{
	public static void main(String[] args) {
	    
	    int a=10;
	    int b=0;
	    divideby(a,b);
		
	}
	static void divideby(int a,int b)
	{
	    try{
	        System.out.print(a/b);
	    }
	    catch(Exception as e){
	        System.out.print(e);
	    }
	}
}
