package encasuletion;

public class bank {
	private double balance;
	public void setBalance(double balance) {
		if(balance>0){
		this.balance = balance;
	}
	else
	{
		System.out.println("please enter the positive number for ammount");
	}
	}
	public double getBalance() {
		return balance;
	}

	
}
