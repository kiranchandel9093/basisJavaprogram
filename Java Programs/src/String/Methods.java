package String;

public class Methods {

	public static void main(String[] args) {
		String name = " Hello this is my java program";
		String value = "09091993";
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(23));
		System.out.println(value.contains("9"));
		System.out.println(name.concat(" for string data type"));
		System.out.println(value.isEmpty());
		String x = value.trim();
		System.out.println(x);
		System.out.println(name.equals(x));
		System.out.println(name.equalsIgnoreCase(x));
		System.out.println(name.replace("my", "my first"));
	}
	

}
