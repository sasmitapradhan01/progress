enum Size{
	SMALL{

		//overriding toString() for SMALL
		public String toString(){
			return "The size is small";
		}
	},
	MEDIUM{
		//overriding toString() for MEDIUM
		public String toString(){
			return "The size is medium.";
		}
	};
}
class Over {
	public static void main(String[] args){
		System.out.println(Size.MEDIUM.toString());
	}
}
