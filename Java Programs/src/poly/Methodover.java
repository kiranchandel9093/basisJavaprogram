package poly;

public class Methodover {
	void A()
	{
		System.out.println("This is method overloading");
	}
	
	void A(int a)
	{
		System.out.println(a);
	}
	
	void A(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Methodover obj = new Methodover();
		obj.A();
		obj.A(10);
		obj.A(10, 20);

	}

}
