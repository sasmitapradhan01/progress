class Database{
	private static Database dbObject;

	private Database(){
	}

	public static Database getInstance(){
		//create object if its not already created
		if(dbObject == null){
			dbObject = new Database();
		}
		//returns the singleton object
		return dbObject;
	}
	public void getConnection(){
		System.out.println("You are now connected to the database.");
	}
}

class Data {
	public static void main(String[] args){
		Database db1;
		//refers to the only object of database
		db1 = Database.getInstance();

		db1.getConnection();
	}
}
