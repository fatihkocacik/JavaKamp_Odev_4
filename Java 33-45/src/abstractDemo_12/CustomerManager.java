package abstractDemo_12;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	
	public void getCustomers() {
		databaseManager.getData();
	}

}
