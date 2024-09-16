package abstrct;

public class BOB extends Bank {

	public static void main(String[] args) {
		BOB obj = new BOB();
		obj.IRY();
		obj.Loop();
	}
	@Override
	void IRY() {
		{
			
		System.out.println("IRY=6.5");
		
	}
		int a = 8;
	if(a<7)
	{
		System.out.println("Normal IR");
	}
	else
	{
		System.out.println("IR is High");
	}
}
}
