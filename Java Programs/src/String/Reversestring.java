package String;

public class Reversestring {

	public static void main(String[] args) {
		String name = "Kiran", temp ="";
		char ch;
		int len = name.length();
		System.out.println(name.length());
		try
		{
		for (int i=0;i<len;i++)
		{
			ch= name.charAt(i);
			temp= ch+temp;
		}
		}
		catch (Exception e) {
			System.out.println(e);	
		}
		System.out.println(temp);
		
		}}
