package operatorcheck;

public class AONE {

	public static void main(String[] args) {
		int a =10, b = 20;
				System.out.println(a == b );// return false because 10 is not equals to b 
				System.out.println(a != b );// return true 
				System.out.println(a > b );//return false
				System.out.println(a < b );// true
				System.out.println(a >= b );//false
				System.out.println(a <= b );//true
				System.out.println(a<b && b>a);//true
				System.out.println(a>b ||b<a);//false one of the statement should be true
				System.out.println(a<b && b>a);//true
				System.out.println(!(a<b && b>a));//false
	
	}
	
	
	
	
}
