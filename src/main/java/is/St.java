@interface MyCustomAnnotation{
String value() default "default value";
}

class St{
	@MyCustomAnnotation(value = "programmiz")
	public void method1(){
		System.out.println("Test method 1");
	}
	public static void main(String[] args) throws Exception {
		St obj = new St();
		obj.method1();
	}
}
