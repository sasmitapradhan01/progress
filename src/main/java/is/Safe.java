import java.util.*;

class Safe{
	@SafeVarargs
	private void displayList(List<String>... lists){
		for (List<String> list : lists){
			System.out.println(list);
		}
	}
	public static void main(String[] args){
		Safe obj = new Safe();
		List<String> universityList = Arrays.asList("Tribhuvan University","Kathmandu University");
		obj.displayList(universityList);

		List<String> programmingLanguages = Arrays.asList("Java","C");
		obj.displayList(universityList,programmingLanguages);
	}
}
