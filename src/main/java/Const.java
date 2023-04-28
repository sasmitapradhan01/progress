import java.lang.Class;
import java.lang.reflect.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class God{

	// public constructor without paramerter
	public God(){
	}
	//private constructor with a single parameter
	private God(int age){
	
	}

}
class Const{
	public static void main(String[] args){
		try{
			//create an object of Dog
			God d1 = new God();

			// Create an object of Class
			// using getClass()
			Class obj = d1.getClass();

			//get all constructor of Dog
			Constructor[] constructors = obj.getDeclaredConstructors();

			for(Constructor c : constructors){

				//get the name of constructors
				System.out.println("Constructor Name: " + c.getName());

				// get the access modifier of constructors
				// convert it into string form
				int modifier = c.getModifiers();
				String mod = Modifier.toString(modifier);
				System.out.println("Modifiers: " + mod);

				//get the number od parameters in constructor
				System.out.println("Parameters: "  + c.getParameterCount());
				System.out.println("");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

