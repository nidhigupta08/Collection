package collection;
import java.util.LinkedList;
public class LinkedListProgram {

	public static void main(String[] args) {
		//creating LinkedList named subject
		LinkedList<String> subject=new LinkedList<>();
		
//1. Add elements to a LinkedList
		subject.add("Java");
		subject.add("Python");
		subject.add("C++");
		subject.add("Android");
		subject.add("Java");
		System.out.println("LinkedList: " +subject);
		
		subject.add(5,"C#");
		System.out.println("LinkedList: " +subject);
		
//2. Access LinkedList elements		
		System.out.println(subject.get(2));

//3. Change Elements of a LinkedList
		subject.set(2, "JavaScript");
		System.out.println(subject);
//4. Remove element from a LinkedList
		subject.remove("Android");
		System.out.println(subject);
		

			
//SIZE()
		System.out.println(subject.size());
		
//IndexOf()
		System.out.println(subject.indexOf("Python"));
		
//		Contains()
		System.out.println(subject.contains("Java"));

//isEmpty()
		System.out.println(subject.isEmpty());

		
//lastIndexOf()
		System.out.println(subject.lastIndexOf("Java"));
		
//Java LinkedList as Queue	    
		
// PEEK(): returns the first element (head) of the linked list
	    String str1 = subject.peek();
	    System.out.println("Accessed Element: " + str1);
	    
 //POLL(): returns and removes the first element from the linked list
	    String str2 = subject.poll();
	    System.out.println("Removed Element: " + str2);
	    System.out.println("LinkedList after poll(): " + subject);

//OFFER(): adds the specified element at the end of the linked list
	    subject.offer("Java");
	    System.out.println("LinkedList after offer(): " + subject);
	    
//addFirst()
	    subject.addFirst("Dog");
	    System.out.println("LinkedList after addFirst(): " + subject);

// addLast(): add elements at the end
	    subject.addLast("Zebra");
	    System.out.println("LinkedList after addLast(): " + subject);

//removeFirst():  remove the first element
	    subject.removeFirst();
	    System.out.println("LinkedList after removeFirst(): " + subject);

 //removeLast(): remove the last element
	    subject.removeLast();
	    System.out.println("LinkedList after removeLast(): " + subject);
	    
 //ITERATOR()
	  		for(String iterator:subject) {
	  			System.out.print(iterator);
	  			System.out.print(", " );
	  			
		}
	}

}
