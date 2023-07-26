package collection;
import java.util.Stack;
public class StackPrograms {

	public static void main(String[] args) {
		Stack<String> language= new Stack<>();
//push() Method:  To add an element to the top of the stack, we use the push() method. 		
		language.push("Python");
		language.push("Java");
		language.push("C++");
		language.push("JavaScript");
		language.push("Android");
		System.out.println(language);
		
//pop() Method:   To remove an element from the top of the stack, we use the pop() method.
		language.pop();
		System.out.println(language);

//peek() Method:  The peek() method returns an object from the top of the stack. 
		
		System.out.println(language.peek());

//search() Method:  It returns the position of the element from the top of the stack.
		
		int position=language.search("Java");
		System.out.println("java position is at " +position);
		
//empty() Method: To check whether a stack is empty or not, we use the empty() method. 
		
		System.out.println(language.isEmpty());
	}

}
