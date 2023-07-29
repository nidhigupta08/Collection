package collection.set;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class SetMethods {

	public static void main(String[] args) {
		 // Creating a set using the HashSet class
		Set<Integer> set1= new HashSet<>(); 
		
//add() - adds the specified element to the set		
		set1.add(1);
		set1.add(2);
		set1.add(4);
		System.out.println("set1 are :" +set1);
		
// Union  OR  addAll() - adds all the elements of the specified collection to the set
		Set<Integer> set2=new HashSet<>();
		set2.add(12);
		set2.add(4);
		set2.add(25);
		set2.addAll(set1);
		System.out.println("set2 are :" +set2);
		
//int size() : It is used to get the number of elements in the set.
		int size= set2.size();
		System.out.println(size);
		
//boolean isEmpty()	This method checks that the set is empty or not.
		System.out.println(set1.isEmpty());
		
//boolean contains(Object o)	This method returns true if this set contains the given element.		
		System.out.println(" check set2 contains 4 or not " +set2.contains(4));
		System.out.println(" check set2 contains 4 or not " + set2.contains(7));
		
//Subset OR containsAll() - returns true if the set contains all the elements of the specified collection		
		System.out.println("set2 contains all element of set1 or not: "+ set2.containsAll(set1));
		System.out.println("set1 contains all element of set2 or not: "+ set1.containsAll(set2));
		
//	Intersection OR retainAll() - retains all the elements in the set that are also present in another specified set
		
		
//boolean equals(Object o)	It is used to compare the given element for equality in this set.	
		System.out.println(" check 4 is present in the set2 or not " + set1.equals(4));
		System.out.println("check 7 is present in the set2 or not " +set2.equals(7));
		
// hashCode() - returns a hash code value (address of the element in the set)		 total count 44
		int hashcode =set2.hashCode();
		System.out.println("HashCode value is :" +hashcode);
		
		
//		remove() - removes the specified element from the set
//		removeAll() - removes all the elements from the set that is present in another specified set		
//		clear() - removes all the elements from the set
//		toArray() - returns an array containing all the elements of the set
		
		
//iterator() - returns an iterator that can be used to access elements of the set sequentially
		
		for(Integer iterator:set2) {
			System.out.print(iterator);
			System.out.print(", ");
		
		}
		System.out.println("\n");
//Calling iterator() method
		
		Iterator<Integer> iterator= set2.iterator();
		//Accessing elements
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
			System.out.print(", ");
		}
		}

}
