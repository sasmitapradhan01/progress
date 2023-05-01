class Meth{
	@Deprecated
	public static void deprecatedMethod(){
		System.out.println("Deprecated method");
	}
	@SuppressWarnings("deprecated")
	public static void main(String[] args){
		Meth depObj = new Meth();
		depObj.deprecatedMethod();
	}
}
