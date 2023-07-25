package collection;
import java.util.ArrayList;
import java.util.Comparator;
public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList<String> subject=new ArrayList<>();
		
//1. Add Elements to an ArrayList
		subject.add("JAVA");
		subject.add("C++");
		subject.add("DSA");
		subject.add("Python");
		
		System.out.println("ArrayList:" +subject);
		
//		We can also pass an index number as an additional parameter to the add() method to add an element
//		at the specified position. For example,
		
		subject.add(4,"JavaScript");
		subject.add(5,"Android");
		System.out.println("after adding through index number:"+subject);
	
//2. Access ArrayList Elements	
		String accessing=subject.get(4);
		 System.out.print("Element at index 4: " + accessing);
		
//3. Change ArrayList Elements(Updating)
		String change= subject.set(1, "Kotlin");
		 System.out.println("After changing value of index 1:"+change);
	
//4. Remove ArrayList Elements
		 String remove=subject.remove(1);
		 System.out.println("Removed elements :"+remove);
		 System.out.println(subject);
		 
//SIZE() METHOD
		int size= subject.size();
		System.out.println("Length of ArrayList :" +size);
		
//SORT() method :sorts the elements in an arraylist according to the specified order.		 
		
//Example 1: Sort the ArrayList in Natural Order
		System.out.println("before sorting:" +subject);
		subject.sort(Comparator.naturalOrder());
		System.out.println("After sorting arraylist:" +subject);
		
//Sort the ArrayList in Reverse Order
		System.out.println("before reverse:" +subject);
		subject.sort(Comparator.reverseOrder());
		System.out.println("After reverse arraylist:" +subject);

//contains() method checks if the specified element is present in the arraylist.
		System.out.println(subject.contains("Python"));
		
//isEmpty():  returns true if the arraylist does not contain any elements		
		System.out.println(subject.isEmpty());
		
//indexOf() Parameter
		System.out.println(subject.indexOf("Python"));
		
//Iterate through an ArrayList: for-each loop to loop through each element of the arraylist.

		for(String iterator:subject) {
			System.out.print(iterator);
			System.out.print(", ");
		}
		
	}

}
