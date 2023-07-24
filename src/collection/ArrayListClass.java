package collection;
import java.util.List;
import java.util.ArrayList;
public class ArrayListClass {

	public static void main(String[] args) {
		//Creating a lost using the ArrayList class 
		List<Integer> nums=new ArrayList<>();
		
		//Adding an elements
		nums.add(2);
		nums.add(4);
		nums.add(6);
		System.out.println("List are:" +nums);   // [2,4,6]
		
		//Access element from the List
		 int access=nums.get(2);   
		System.out.println("Accessed elements :"+access );  // 6
		
		//Remove elements from list
		int remove=nums.remove(0);
		System.out.println("Removed elemets :"+ remove); //2
	}

}
