package collection;

import java.util.Vector;
public class VectorPrograms {

	public static void main(String[] args) {
		
		Vector<String> animals=new Vector<>();
	
//Add Elements to Vector
		//add(element) - adds an element to vectors
		animals.add("Dog");
		animals.add("Cat");
		
		//add(index, element) - adds an element to the specified position
		animals.add(2,"Horse");
		animals.add(3,"Donkey");
	System.out.println("Animals are:" +animals);	
		//addAll(vector) - adds all elements of a vector to another vector
		
		Vector<String> animals1=new Vector<>();
		animals.add("Monkey");
		
		animals1.addAll(animals);
		System.out.println("All animals are:"+ animals1);
		animals1.add(3,"Mongoose");
		System.out.println("All animals are:"+ animals1);
		
//Access Vector Elements
		//get(index) - returns an element specified by the index
		
		System.out.println(animals1.get(3));
		
		//iterator() - returns an iterator object to sequentially access vector elements
		for(String iterator1:animals1) {
		System.out.print(iterator1);
		System.out.print(", ");
		}
		
//Remove Vector Elements
		//remove(index) - removes an element from specified position
		animals1.remove(3);
		System.out.println("after removing index 3 elements" +animals1);
		
//		removeAll() - removes all the elements
//		clear() - removes all elements. It is more efficient than removeAll()
			

		//set()	changes an element of the vector
		animals.set(3, "mongoose");
		System.out.println("after updating index 3 elements" +animals1);
		
		//size()	returns the size of the vector
		System.out.println(animals1.size());

//		contains()	searches the vector for specified element and returns a boolean result	
		System.out.println(animals1.contains("Dog"));		


System.out.println(animals);
//		toString()	converts the vector into a String
	System.out.println("The String representation is: " + animals.toString());		
	
//		toArray()	converts the vector into an array
		 // Creating the array and using toArray()
	
        Object[] arr = animals1.toArray();
        System.out.println("The array is:");
        for (int j = 0; j < arr.length; j++)
            System.out.println(arr[j]);
    }

		

		
	
		
		
	}

