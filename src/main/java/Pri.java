import java.lang.Class;
import java.lang.reflect.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Dog1{
	private String color;
}

class Pri{
	public static void main(String[] args){
		try{
			//create an object of Dog
			Dog1 d1 = new Dog1();

			//creat an object of class
			////using getClass()
			Class obj = d1.getClass();

			//access the private field colr
			Field field1 = obj.getDeclaredField("color");

			//alloow modification of the private field
			field1.setAccessible(true);

			//set the value of color
			field1.set(d1,"brown");

			//get the value of field color
			String colorValue = (String) field1.get(d1);
			System.out.println("Value: " + colorValue);

			//get the access modifier of color
			int mod2 = field1.getModifiers();

			//convert the access modifer to String
			String modifier2 = Modifier.toString(mod2);
			System.out.println("Modifier: " + modifier2);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
