package overriding_10;

public class Main {

	public static void main(String[] args) {
		BaseLoanManager[] loanManagers = new BaseLoanManager[] { new TeacherLoanManager(),
				new AgriculturalLoanManager(), new StudentLoanManager() };
		
		for (BaseLoanManager loanManager : loanManagers) {
			System.out.println(loanManager.calculate(1000)); 
			
		}
	}

}
