package atm;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmOperation implements AtmInterface {

	Atm atm = new Atm();
	Map<Double, String> ministmt = new HashMap<>();
	public void viewBalance() {
		System.out.println("AvailableBalance:" +  atm.getBalance());
		
	}

	
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%500 == 0) {
			if(withdrawAmount <= atm.getBalance()) {
				System.out.println("Collect the cash " + withdrawAmount);
				atm.setBalance(atm.getBalance() - withdrawAmount);
				ministmt.put(withdrawAmount, "Amount Withdraw");
				viewBalance();
			}
			else {
				System.out.println("Insufficient Balance");
			}
			
		}
		else {
			System.out.println("Enter the amount in terms of 500");
		}
	}

	
	public void depositeAmount(double depositeAmount) {
		System.out.println("DepositedAmpount is :" + depositeAmount);
		atm.setBalance(atm.getBalance()+depositeAmount);
		 ministmt.put(depositeAmount, "Deposited sucessfully");
		
	}

	
	public void viewMiniStatement() {
		Set<Double> set=ministmt.keySet();
		for(Double d : set) {
			System.out.println(d + "=" + ministmt.get(d));
		}
		
		
	}
	

}
