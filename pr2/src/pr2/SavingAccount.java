package pr2;

public class SavingAccount extends Account implements Valuable{
	private int month;
	private double loan;
	private int numonth;
	public double nbalance;
	SavingAccount(double m,double loan) {
		super(m);
		this.loan=loan;
	}
 
	
	@Override
	public double getWithdrawableAccount() {
		return balance+credit_limit;
	}

	@Override
	public void passTime(int month){
		this.setMonth(month);
		numonth+=month;
		if(numonth==12){
		balance = balance*(Math.pow(1+loan,numonth));
		}
		
	}
	
	public void passTime(){
		this.setMonth(1);
		numonth+=1;
		if(numonth==12){
		balance = balance*(Math.pow(1+loan,numonth));
		}
		
	}
	
	@Override
	public void debit(double m){
		if (numonth < 12){
			System.out.print("Withdrawal denied.Can withdraw after at least one year\n");
		} else {
			balance-=m;
			if(balance<0){
				System.out.print("Debit amount exceeded amount balance\n");
				balance+=m;
			}
		}
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	@Override
	public double EstimateValue(int month) {
		nbalance = nbalance*(Math.pow(1+loan,month));
		return nbalance;
	}
	
	public double EstimateValue() {
		nbalance=balance;
		balance = balance*(Math.pow(1+loan,1));
		return balance;
	}
	public String toString(){
		return String.format("SavingAccount_Balance:"+balance);
	}
}

