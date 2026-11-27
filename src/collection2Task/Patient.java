package collection2Task;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

// question 1

public class Patient {
	
	int id;
    String name;
    int age;
    String disease;
    String contact;
    int priority;

    Patient(int id, String name, int age, String disease,
           String contact, int priority) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.contact = contact;
        this.priority = priority;
    }

    void display() {
        System.out.println(id + " " + name + " " + age + " "
                + disease + " " + contact + " Priority: " + priority);
    }

	public static void main(String[] args) {
		
		 	ArrayList<Patient> list = new ArrayList<>();

	        
	        Deque<Patient> waiting = new LinkedList<>();

	        
	        HashMap<Integer, Patient> map = new HashMap<>();

	        
	        PriorityQueue<Patient> emergency = new PriorityQueue<>((a, b) -> a.priority - b.priority);

	        
	        HashSet<String> contacts = new HashSet<>();

	        
	        Stack<Patient> history = new Stack<>();

	        
	        TreeSet<Integer> ids = new TreeSet<>();

	        
	        TreeMap<Integer, Patient> sortedPatients = new TreeMap<>();

	        
	        Patient p1 = new Patient(101, "Arun", 25, "Fever",
	                "9876543210", 3);

	        Patient p2 = new Patient(102, "Priya", 32, "Heart Problem",
	                "9876543211", 1);

	        Patient p3 = new Patient(103, "Rahul", 45, "Accident",
	                "9876543212", 2);

	        Patient p4 = new Patient(104, "Sneha", 28, "Cold",
	                "9876543213", 4);

	        
	        list.add(p1);
	        list.add(p2);
	        list.add(p3);
	        list.add(p4);

	        
	        waiting.addLast(p1);
	        waiting.addLast(p2);
	        waiting.addLast(p3);
	        waiting.addLast(p4);

	        
	        map.put(p1.id, p1);
	        map.put(p2.id, p2);
	        map.put(p3.id, p3);
	        map.put(p4.id, p4);

	        
	        emergency.add(p1);
	        emergency.add(p2);
	        emergency.add(p3);
	        emergency.add(p4);

	        
	        contacts.add(p1.contact);
	        contacts.add(p2.contact);
	        contacts.add(p3.contact);
	        contacts.add(p4.contact);

	        
	        history.push(p1);
	        history.push(p2);
	        history.push(p3);
	        history.push(p4);

	       
	        ids.add(p1.id);
	        ids.add(p2.id);
	        ids.add(p3.id);
	        ids.add(p4.id);

	        
	        sortedPatients.put(p1.id, p1);
	        sortedPatients.put(p2.id, p2);
	        sortedPatients.put(p3.id, p3);
	        sortedPatients.put(p4.id, p4);

	        
	        System.out.println("---- All Patients ----");
	        for (Patient p : list) {
	            p.display();
	        }

	        
	        System.out.println("---- Waiting Patients ----");
	        for (Patient p : waiting) {
	            System.out.println(p.name);
	        }

	       
	        Patient p5 = new Patient(105, "Kumar", 50, "Emergency",
	                "9876543214", 0);
	        waiting.addFirst(p5);

	        System.out.println("First waiting patient: " + waiting.getFirst().name);

	        
	        System.out.println("---- Search Patient ----");
	        Patient search = map.get(102);

	        if (search != null) {
	            search.display();
	        } else {
	            System.out.println("Patient not found");
	        }

	        
	        System.out.println("---- Emergency Priority ----");
	        while (!emergency.isEmpty()) {
	            Patient p = emergency.poll();
	            System.out.println(p.name + " Priority: " + p.priority);
	        }

	        
	        System.out.println("---- Contact Numbers ----");
	        System.out.println(contacts);

	        
	        System.out.println("---- Recent Patients ----");
	        while (!history.isEmpty()) {
	            System.out.println(history.pop().name);
	        }

	        
	        System.out.println("---- Sorted Patient IDs ----");
	        System.out.println(ids);

	
	        System.out.println("---- Patients Sorted by ID ----");
	        for (Integer id : sortedPatients.keySet()) {
	            System.out.println(id + " " + sortedPatients.get(id).name);
	        }
	}

}
