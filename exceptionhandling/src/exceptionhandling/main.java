package exceptionhandling;

public class main {

	public static void main(MainString[] args) {
		// TODO Auto-generated method stub
		int x=10;
        try {
        	System.out.println("the value of x is :"+x/2);
        }
        catch(ArithmeticException e ) {
        	System.out.println("arithmetic Exception occured");
        }
        catch(Exception e) {
        	e.printStackTrace();
        	System.out.println("Inside exception block");
        	
        	
        }
	}

}
