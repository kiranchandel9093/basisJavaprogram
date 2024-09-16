package poly;

	class Fruits
	{
		void A()
		{
			System.out.println("Types of Fruits");
		}
	}


public class Childor extends Fruits {
	void A()
	{
		
		super.A();
		System.out.println("Sweet, Citric");
		
	}
	
	public static void main(String[] args) {
		
		Childor obj = new Childor();
		obj.A();

	}
}
