package constructor;

public class Register {
	public Register()
	{
		System.out.println("new Student Registration");
	}
	
	public Register(int a)
	{
		System.out.println(a=10);
	}
	
	/*void Detail()

	{
		System.out.println("Student name: ");
	}*/
	
	public static void main(String[] args) {
		
		Register obj = new Register();
		Register obj2 = new Register();
		
	}
}

