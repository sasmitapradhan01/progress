import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class Ne{
	//declaring the type of exception
	public static void findFile() throws IOException{
		
		// code that may generate IOException
		File newFile = new File("test.txt");
		FileInputStream stream = new FileInputStream(newFile);
	}

	public static void main(String[] args){
		try{
			findFile();
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}

