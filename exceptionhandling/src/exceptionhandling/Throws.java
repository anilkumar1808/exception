package exceptionhandling;


public class Throws {

	public static void main(MainString[] args)  {
		// TODO Auto-generated method stub
		try {
			somemethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("catch bloc of main method");
		}

	}
	public static  void somemethod() throws Exception {
	 
		System.out.println("msge from somemethod");
		  throw new Exception();
	}

}
