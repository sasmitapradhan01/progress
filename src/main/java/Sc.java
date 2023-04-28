import java.io.*;
import java.util.*;

class Sc{
	public static void main(String[] args) throws IOException{
		try(Scanner scanner = new Scanner(new File("testRead.txt"));
		    PrintWriter writer = new PrintWriter(new File("testWrite.txt"))){
			while(scanner.hasNext()){
				writer.print(scanner.nextLine());
			}
		    }
	}
}
