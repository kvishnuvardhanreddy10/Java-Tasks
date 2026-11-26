package innerClassAndCollectionsTask;

import java.util.ArrayList;

// question 2

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<>();
		
		names.add("Vishnu");
		names.add("Venkat");
		names.add("Badri");
		names.add("Anwar");
		names.add("Nasar");
		
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
			
	}

}
