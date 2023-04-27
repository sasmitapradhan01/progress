import java.lang.Class;
import java.lang.reflect.*;

class Dogg{
	public String type;
}

class Fielding{
	public static void main(String[] args){
		try{
			// create   object of Dog
			Dogg d1 = new Dogg();

			// create an object of class
			// using getClass()
			Class obj = d1.getClass();

			//access and set the type field
			Field field1 = obj.getField("type");
			field1.set(d1,"labrador");

			// get the value of the field type
			String typeValue = (String)field1.get(d1);
			System.out.println("Value: " + typeValue);

			//get the access modifers of the field type
			int mod = field1.getModifiers();

			// get the access modifier to String form
			String modifier1 = Modifier.toString(mod);
			System.out.println("Modifer: " + modifier1);
			System.out.println(" ");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
