package Allprograms;

public class Pattern {
	
	
	public static void main(String[] args) {
		int n = 6;
		Numbers(n);
		
	}

	private static void Numbers(int n) {
		
		int i , j ;
	
		/*for(i=1;i>=n;i++)
		{
			for( j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
		for(j=1;j<=i;j++)
		{
			System.out.print(i+ " ");
		}
		System.out.println();
		}
		*/
		
		for(i=n;i>=1;i--)
		{
			for( j=1;j<=i;j++) {
				System.out.print(j + " ");	
			}
			System.out.println();
		}
		
	}	
	
	
	
}
