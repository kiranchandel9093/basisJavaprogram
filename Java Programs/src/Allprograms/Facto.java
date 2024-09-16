package Allprograms;

public class Facto {
	void Fact()
	{

		System.out.println("Factorial of number : ");
	}
		
		
	void Fact(int i,int n,int f) 
		
	{
		n=1;f=5;
		for(i=0;i<n;i++)
		{
			f=f*n;
		}
		System.out.println("Factorial of 5 :"+f);
		
	}
		
	public static void main(String[] args) {
		
		Facto obj = new Facto();
		obj.Fact(0, 0, 0);
		obj.Fact();
		
		
		
		/*int	f =1;
		int n= 5;
		for(int i=1;i<n;i++)
		{
			f=f*n;
		}
		System.out.println("Factorial of 5 is :" + f);
	}*/

}
}
