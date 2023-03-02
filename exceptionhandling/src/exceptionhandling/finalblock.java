package exceptionhandling;

public class finalblock {

	public static void main(MainString[] args) {
		// TODO Auto-generated method stub
		int x =20;
		try {
			System.out.println("we dont know the output value , let see :"+x/5);
			
		}catch(RuntimeException e){
			System.out.println("runtime exception ");
			
		}catch(Exception e) {
			System.out.println("Excpetion....!!!");
		}
		finally{
			System.out.println("this will be printed");
		}

	}

}
