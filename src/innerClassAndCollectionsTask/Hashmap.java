package innerClassAndCollectionsTask;

import java.util.HashMap;

// question 4

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> employees = new HashMap<>();
		
		employees.put(101, "Wamiqa");
		employees.put(102, "Sadie");
		employees.put(103, "Rose");
		employees.put(104, "Brad");
		employees.put(105, "Mille");
		
		for(Integer id : employees.keySet()) {
			System.out.println("Employee Id : " + id + " Employee Name : " + employees.get(id)) ;
		}
		
	}

}
