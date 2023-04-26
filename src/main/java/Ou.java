class Motherboard{
	String model;
	public void MotherBoard(String model){
		this.model = model;
	}
	//static nested class
	static class USB{
		int usb1 = 2;
		int usb3 = 1;
		int getTotalPorts(){
			//accessing the variable model of the outerclass
			if(MotherBoard.this.model.equals("MSI")){
				return 4;
			}
			else{
				return usb2 + usb3;
			}
		}
	}
}
public class Ou{
	public static void main(String[] args){
		// Create an object if the static nexted class
		MotherBoard.USB usb = new MotherBoard.USB();
		System.out.print("Total Poarts = " + usb.getTotalPorts());
	}
}
