import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;

class Fil{
	public static void main(String[] args){
		String line;
		try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
			while((line = br.readLine())!=null){
				System.out.println("Line =>"+line);
			}
		}catch(IOException e){
			System.out.println("IOException in try block =>" + e.getMessage());
			Throwable[] suppressedExceptions = e.getSuppressed();
			for(int i=0;i<suppressedExceptions.length;i++){
				System.out.println("Suppresses exception+>" + suppressedExceptions[i]);
			}
		}
	}
}
