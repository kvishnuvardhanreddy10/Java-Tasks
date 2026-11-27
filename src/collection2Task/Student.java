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

// question 2

public class Student {
	
	int rollNo;
    String name;
    int marks;
    String email;

    Student(int rollNo, String name, int marks, String email) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.email = email;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + marks + " " + email);
    }

	public static void main(String[] args) {
		
		ArrayList<String> studentNames = new ArrayList<>();

        Deque<Student> registrationQueue = new LinkedList<>();

        HashMap<Integer, Integer> marksMap = new HashMap<>();

        PriorityQueue<Student> ranking = new PriorityQueue<>((a, b) -> b.marks - a.marks);

        HashSet<String> emails = new HashSet<>();

        Stack<Student> recentStudents = new Stack<>();

        TreeSet<Integer> rollNumbers = new TreeSet<>();

        TreeMap<Integer, Student> sortedStudents = new TreeMap<>();

        Student s1 = new Student(101, "Arun", 85, "arun@gmail.com");
        Student s2 = new Student(102, "Priya", 95, "priya@gmail.com");
        Student s3 = new Student(103, "Rahul", 78, "rahul@gmail.com");
        Student s4 = new Student(104, "Sneha", 90, "sneha@gmail.com");

        
        studentNames.add(s1.name);
        studentNames.add(s2.name);
        studentNames.add(s3.name);
        studentNames.add(s4.name);

       
        registrationQueue.addLast(s1);
        registrationQueue.addLast(s2);
        registrationQueue.addLast(s3);
        registrationQueue.addLast(s4);

        
        marksMap.put(s1.rollNo, s1.marks);
        marksMap.put(s2.rollNo, s2.marks);
        marksMap.put(s3.rollNo, s3.marks);
        marksMap.put(s4.rollNo, s4.marks);

        
        ranking.add(s1);
        ranking.add(s2);
        ranking.add(s3);
        ranking.add(s4);

      
        emails.add(s1.email);
        emails.add(s2.email);
        emails.add(s3.email);
        emails.add(s4.email);

        
        recentStudents.push(s1);
        recentStudents.push(s2);
        recentStudents.push(s3);
        recentStudents.push(s4);

       
        rollNumbers.add(s1.rollNo);
        rollNumbers.add(s2.rollNo);
        rollNumbers.add(s3.rollNo);
        rollNumbers.add(s4.rollNo);

       
        sortedStudents.put(s1.rollNo, s1);
        sortedStudents.put(s2.rollNo, s2);
        sortedStudents.put(s3.rollNo, s3);
        sortedStudents.put(s4.rollNo, s4);

        
        System.out.println("---- Student Names ----");
        System.out.println(studentNames);

      
        System.out.println("---- Registration Queue ----");
        for (Student s : registrationQueue) {
            System.out.println(s.name);
        }

       
        Student s5 = new Student(105, "Kiran", 88, "kiran@gmail.com");
        registrationQueue.addFirst(s5);

        System.out.println("First student in queue: " + registrationQueue.getFirst().name);

        
        System.out.println("---- Student Marks ----");
        System.out.println("Roll No 102 Marks: " + marksMap.get(102));

       
        System.out.println("---- Student Ranking ----");
        int rank = 1;

        while (!ranking.isEmpty()) {
            Student s = ranking.poll();
            System.out.println(rank + ". " + s.name + " - " + s.marks);
            rank++;
        }

        
        System.out.println("---- Unique Email IDs ----");
        System.out.println(emails);

       
        System.out.println("---- Recent Student Records ----");
        while (!recentStudents.isEmpty()) {
            Student s = recentStudents.pop();
            System.out.println(s.name);
        }

     
        System.out.println("---- Sorted Roll Numbers ----");
        System.out.println(rollNumbers);

      
        System.out.println("---- Students Sorted by Roll Number ----");
        for (Integer roll : sortedStudents.keySet()) {
            Student s = sortedStudents.get(roll);
            System.out.println(roll + " " + s.name + " " + s.marks);
        }

	}

}

