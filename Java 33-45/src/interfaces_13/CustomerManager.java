package interfaces_13;

public class CustomerManager  {
	
	private ICustomerDal customerDal;
	
	 public CustomerManager (ICustomerDal customerDal) {
		 this.customerDal = customerDal;
	 }
	
	public void add() {
		customerDal.add(); 
	}

}
