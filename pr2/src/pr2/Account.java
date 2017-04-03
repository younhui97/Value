package pr2;

public abstract class Account{
	protected double balance;
	protected double credit_limit;
	Account(double m){
		balance = m;
	} 
	
	
	public double getBalance(){
		return balance;
	}
	
	public abstract double getWithdrawableAccount();
	
	public abstract void passTime(int time);
	
	protected void setBalance(double m){
		balance = m;
	}
	public void credit(double m){
		balance += m;
	}
	public void debit(double m){
		balance -= m;
		if(balance<0){
			System.out.print("Debit amount exceeded amount balance\n");
			balance+=m;
		}
	}
}
