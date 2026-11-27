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

// question 3

public class Order {
	
	int orderId;
    String customerName;
    int productId;
    String productName;
    int quantity;
    int priority;

    Order(int orderId, String customerName, int productId,
          String productName, int quantity, int priority) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.priority = priority;
    }

    void display() {
        System.out.println(orderId + " " + customerName + " "
                + productId + " " + productName + " "
                + quantity + " Priority: " + priority);
    }

	public static void main(String[] args) {
		
		ArrayList<Order> orderList = new ArrayList<>();

        Deque<Order> pendingOrders = new LinkedList<>();

        HashMap<Integer, Order> orderMap = new HashMap<>();

        PriorityQueue<Order> priorityOrders = new PriorityQueue<>((a, b) -> a.priority - b.priority);

        HashSet<Integer> customerIds = new HashSet<>();

        Stack<Order> cancelledOrders = new Stack<>();

        TreeSet<Integer> productIds = new TreeSet<>();

        TreeMap<Integer, Order> sortedOrders = new TreeMap<>();

        
        Order o1 = new Order(501, "Arun", 1001,
                "Shoes", 2, 2);

        Order o2 = new Order(502, "Priya", 1002,
                "Watch", 1, 1);

        Order o3 = new Order(503, "Rahul", 1003,
                "Bag", 3, 3);

        Order o4 = new Order(504, "Sneha", 1004,
                "Headphones", 1, 4);


        orderList.add(o1);
        orderList.add(o2);
        orderList.add(o3);
        orderList.add(o4);

     
        pendingOrders.addLast(o1);
        pendingOrders.addLast(o2);
        pendingOrders.addLast(o3);
        pendingOrders.addLast(o4);

        
        orderMap.put(o1.orderId, o1);
        orderMap.put(o2.orderId, o2);
        orderMap.put(o3.orderId, o3);
        orderMap.put(o4.orderId, o4);

       
        priorityOrders.add(o1);
        priorityOrders.add(o2);
        priorityOrders.add(o3);
        priorityOrders.add(o4);

       
        customerIds.add(201);
        customerIds.add(202);
        customerIds.add(203);
        customerIds.add(204);

  
        cancelledOrders.push(o1);
        cancelledOrders.push(o3);

        
        productIds.add(o1.productId);
        productIds.add(o2.productId);
        productIds.add(o3.productId);
        productIds.add(o4.productId);

       
        sortedOrders.put(o1.orderId, o1);
        sortedOrders.put(o2.orderId, o2);
        sortedOrders.put(o3.orderId, o3);
        sortedOrders.put(o4.orderId, o4);

       
        System.out.println("---- All Orders ----");
        for (Order o : orderList) {
            o.display();
        }

        
        System.out.println("---- Pending Orders ----");
        for (Order o : pendingOrders) {
            System.out.println(o.orderId + " " + o.productName);
        }

       
        Order o5 = new Order(505, "Kiran", 1005,
                "Laptop", 1, 0);

        pendingOrders.addFirst(o5);

        System.out.println("First pending order: "
                + pendingOrders.getFirst().productName);

        
        System.out.println("---- Search Order ----");
        Order search = orderMap.get(502);

        if (search != null) {
            search.display();
        } else {
            System.out.println("Order not found");
        }

        
        System.out.println("---- Priority Order Processing ----");
        while (!priorityOrders.isEmpty()) {
            Order o = priorityOrders.poll();
            System.out.println(o.orderId + " " + o.productName
                    + " Priority: " + o.priority);
        }

        
        System.out.println("---- Unique Customer IDs ----");
        System.out.println(customerIds);

        
        System.out.println("---- Cancelled Orders ----");
        while (!cancelledOrders.isEmpty()) {
            Order o = cancelledOrders.pop();
            System.out.println(o.orderId + " " + o.productName);
        }

        
        System.out.println("---- Sorted Product IDs ----");
        System.out.println(productIds);

        
        System.out.println("---- Orders Sorted by Order ID ----");
        for (Integer id : sortedOrders.keySet()) {
            Order o = sortedOrders.get(id);
            System.out.println(id + " " + o.customerName
                    + " " + o.productName);
        }

	}

}
