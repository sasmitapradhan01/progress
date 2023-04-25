//importing the FileReader class
import java.io.FileReader;

class Input{
	public static void main(String[] args) {
		char[] array = new char[100];
		try{
			//creates a reader using the FileReader
			FileReader input = new FileReader("input.txt");

			//reads characters
			input.read(array);
			System.out.println("Data in the file:");
			System.out.println(array);

			//closes the reader
			input.close();
		}catch(Exception e){
			e.getStackTrace();
		}
	}
}


