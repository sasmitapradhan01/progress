class GenericsClass<T extends Number>{
	public void display(){
		System.out.println("This is a bounded type generics class.");
	}
}

class Number{
	public static void main(String[] args){

		// create an object of GenericsClass
		GenericsClass<Double> obj = new GenericsClass<Double>();
		obj.display();
	}
}
