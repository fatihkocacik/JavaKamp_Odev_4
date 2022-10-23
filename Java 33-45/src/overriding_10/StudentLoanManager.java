package overriding_10;

public class StudentLoanManager extends BaseLoanManager {
	
	public double calculate(double cost) {
		return cost * 1.10;
	}

}
