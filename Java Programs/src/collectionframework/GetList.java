package collectionframework;

import java.util.ArrayList;

import java.util.List;

public class GetList {

	public static void main(String[] args) {
		List obj = new ArrayList<String>();
		obj.add("Name:");
		obj.add("Address:");
		obj.add("Contact:");
	
		System.out.println("Array list :" + obj);
		/*System.out.println(obj.contains("Add"));
		System.out.println(obj.size());
		System.out.println(obj.isEmpty());
		System.out.println(obj.remove(2));
		*/
		
		List Animals = new ArrayList<String>();
		Animals.add("Cat");
		Animals.add("Dog");
		Animals.add("Cow");
		Animals.add("Goat");
		
		System.out.println("Arraylist :" + Animals);
		
		List Animal_Food = new ArrayList<String>();
		Animal_Food.add("Mouse");
		Animal_Food.add("Bone");
		Animal_Food.add("Grass");
		Animal_Food.add("Leaves");
		
		System.out.println("Arraylist :" + Animal_Food);
		
		Animals.addAll(obj);
		//Animals.addAll(Animal_Food);
		Animals.addAll(3, Animal_Food);
		
		System.out.println("Arraylist :" + Animals);
		
		Animals.add(2, "Tiger");
	
		System.out.println("Arraylist :" + Animals);
		System.out.println(Animals.get(3));
		
	}

}
