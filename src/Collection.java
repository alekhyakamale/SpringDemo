import java.util.*;
import java.util.stream.Stream;  

class Collections{  
   public static void main(String args[]){ 
	  //List Interface implemented by following classes:
	 
	  //ArrayList implementation
	   ArrayList<String> alist=new ArrayList<String>(); 
	      alist.add("Steve");
	      alist.add("Tim");
	      alist.add("Lucy");
	      alist.add("Pat");
	      alist.add("Angela");
	      alist.add("Tom");
	      alist.add("Lucy"); 

	      //displaying elements
	      System.out.println(alist);

	      //Removing Steve and Angela
	      alist.remove("Steve");
	      alist.remove("Angela");

	      //displaying elements
	      System.out.println(alist);

	      //Removing 3rd element ("Pat")
	      alist.remove(2);

	      //displaying elements
	      System.out.println(alist);
        
        //LinkedList implementation
        LinkedList<String> al=new LinkedList<String>();  
        al.add("Ravi");  
        al.add("Vijay");  
        al.add("Ravi");  
        al.add("Ajay");  
        
        Iterator<String> itr=al.iterator();  //looping using Iterator
        while(itr.hasNext()){  				 //If the next element exists
         System.out.println(itr.next()); 	 //the next element is printed
        }
        
        //Vector implementation
        Vector<String> v=new Vector<String>();  
        v.add("Ayush");  
        v.add("Amit");  
        v.add("Ashish");  
        v.add("Garima");  
        v.add("Garima"); 
        Iterator<String> iter=v.iterator();  
        while(iter.hasNext()){  
        System.out.println(iter.next());  
        }  
        
        //Stack implementation
        Stack<String> stack = new Stack<String>();  
        stack.push("Laptop");  
        stack.push("Charger");  
        stack.push("Mobile phone");    
        stack.pop();  //LIFO the last element is deleted
        Iterator<String> it=stack.iterator();  
        while(it.hasNext()){  
        System.out.println(it.next());  
        } 
        
        //Queue Interface
        //Priority queue implementation
        PriorityQueue<String> queue=new PriorityQueue<String>();  
        queue.add("Venice");  
        queue.add("London");  
        queue.add("NewYork");  
        System.out.println("head:"+queue.element());  
        System.out.println("head:"+queue.peek());  
        System.out.println("iterating the queue elements:");  
        Iterator iter1=queue.iterator();  
        while(iter1.hasNext()){  
        System.out.println(iter1.next());  
        }  
        queue.remove();  //removes the head of the queue
        queue.poll();    //removes the head of the queue
        System.out.println("after removing two elements:");  
        Iterator<String> itr2=queue.iterator();  
        while(itr2.hasNext()){  
        System.out.println(itr2.next());  
        }  
        
        //Dequeue interface
        //Array Dequeue implementation
        //Can remove element from both ends.
        Deque<String> deque = new ArrayDeque<String>();  
        deque.add("Purse");  
        deque.add("Bag");  
        deque.add("Cello");  
        deque.remove(); 
        //Traversing elements using enhanced for loop
        for (String str : deque) {  
        System.out.println(str);  
        }  
        
        //Set Interface
        //HashSet implementation
        
        HashSet<String> set=new HashSet<String>();  
        set.add("Employee1");  
        set.add("Employee2");  
        set.add("Employee3");  
        set.add("Employee3"); //no duplicate items can be stored
        set.add("Employee5");  
        //Traversing elements using Iterator Interface abstract method
        Iterator<String> itr3=set.iterator();  
        while(itr3.hasNext()){  
        System.out.println(itr3.next());  
        }  
        
        //Linked HashSet implementation
        LinkedHashSet<String> set1=new LinkedHashSet<String>();  
        set.add("Student1");  
        set.add("Student2");  
        set.add("Student3");  
        Iterator<String> itr4=set1.iterator();  
        while(itr4.hasNext()){  
        System.out.println(itr4.next());  
        }  
        
        //Sorted Set Interface
        //Tree set implementation
        TreeSet<String> set2=new TreeSet<String>();  
        set.add("Employer");  
        set.add("Employee");  
        set.add("Manager");  
        //traversing elements  
        Iterator<String> itr5=set2.iterator();  
        while(itr5.hasNext()){  
        System.out.println(itr5.next());  
        }  
        
        //Map Interface is not a part of the Collection interface:
        
        //HashMap class implementing Map Interface
        Map<String, String> map = new HashMap<>();		
        Map<String, String> mapB = new HashMap<>();

        map.put("key1", "element 1");
        System.out.println(map);
        mapB.putAll(map);
        System.out.println(mapB);  //Copying from map
        
        Iterator iterator = map.keySet().iterator();

        //Iterating the Keys of a Java Map 
        //Using key iterator.
        while(iterator.hasNext()){
          Object key   = iterator.next();
          Object value = map.get(key);
          System.out.println(value);
        }
        //Via for loop
        for(String value : map.values()){
            System.out.println(value);
        }
        //Using stream and forEach
        map.put("key1", "first");
        map.put("key2", "second");
        map.put("key3", "third");

        Stream<String> stream = map.values().stream();
        //using lambda expression
        stream.forEach(value -> {						
            System.out.println(value);
        });
        
        //Using Stream API map method on list
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15 ,20); 
        //Using method reference in forEach
        list.stream().map(number -> number * 3).forEach(System.out::println);
        //Using stream filter
        list.stream().filter(number -> number % 5 == 0).forEach(System.out::println); 
        //Using stream reduce
        int sum = list.stream().reduce(0, (element1, element2) -> element1 + element2);
        System.out.println(sum);
   } 
}