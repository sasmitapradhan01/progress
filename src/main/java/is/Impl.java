import java.util.List;
import java.util.ArrayList;

class Impl{
	public static void main(String[] args){
		// creating list using Arraylist class
		List<Integer> numbers = new ArrayList<>();

		//Add elements to the list
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("List: " + numbers);

		//Access element from the list
		int number = numbers.get(2);
		System.out.println("Accessed Element: " + number);

		//Remove element from the list
		int removedNumber = numbers.remove(1);
		System.out.println("Removed Element: " + removedNumber);
	}
}
