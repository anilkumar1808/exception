package exceptionhandling;

public class app {

	public static void main(MainString[] args) {
		// TODO Auto-generated method stub
		app obj1 = new app();
		obj1.a(0, 2);

	}
	public void a(int x ,int y) {
		if(x != 0) {
			System.out.println(x/y);
			
		}else {
			System.out.println("value of x is not");
		}
	}
	public void b(int x, int y) {
		try {
			System.out.println(x/y);
		}catch(Exception e) {
			System.out.println("value of x is not");
			
		}
	}

}
