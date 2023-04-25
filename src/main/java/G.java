class G{
	public static void main(String[] args){
		// initialize generic class
		// with Integer data
		GenericsClass<Integer> intObj = new GenericsClass<>(5);
		System.out.println("generic class returns: " +intObj.getData());

		//initialize generics class
		// with String data
		GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
		System.out.println("Generic Class returns: " + stringObj.getData());

	}
}

// create a generics class
class GenericsClass<T> {

	//variable of T type
	private T data;

	public GenericsClass(T data){
		this.data = data;
	}

	//mehos that return T type variable
	public T getData(){
		return this.data;
	}
}
