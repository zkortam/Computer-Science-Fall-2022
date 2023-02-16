// Comments for info 



class Account {
	private long number;
	private double balance;
	
	public Account(){
		number = 0;
		balance = 0;
	}
	
	public Account(long number, double balance){
		this.number = number;
		this.balance = balance;
	}
	
	public long getNumber(){
		return number;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public void deposit(double amount){
		if(amount >= 0){
			balance = balance + amount;
		}
	}
	
	public void withdraw(double amount){
		if(amount >= 0 && amount <= balance){
			balance = balance - amount;
		}
	}
	@Override
	public String toString(){
		 return String.format("Account Number [%d] | Current Balance: $%.2f.",
            number, balance);
	}
}
	
class SavingsAccount extends Account {
	private double apr; 
	
	public SavingsAccount(){
		super(0,0);
		apr = 0;
		
	}
	
	public SavingsAccount(long number, double balance, double apr){
		super(number,balance);
		this.apr = apr;
		
	}
	
	public void setApr(double apr){
		if(apr >= 0){
			this.apr = apr;
		}
	}
	
	public double getApr(){
		return apr;
	}
	
	public double calculateInterest(){
		
		return getBalance()*apr;
		
	}
	
	@Override
	public String toString(){
		 return String.format("Account Number [%d] | APR: %.1f | Current Balance: $%.2f.",
            super.getNumber(), apr, super.getBalance());
	}
	
	
}

class CreditCardAccount extends Account {
	private double apr; 
	private double creditLimit; 
	
	public CreditCardAccount(){
		super(0,0);
		apr = 0;
		creditLimit = 0;
		
	}
	
	public CreditCardAccount(long number, double balance, double apr, double creditLimit){
		super(number,balance);
		this.apr = apr;
		this.creditLimit = creditLimit;
		
	}
	
	public void setApr(double apr){
		if(apr >= 0){
			this.apr = apr;
		}
	}
	
	public double getApr(){
		return apr;
	}
	
	public void setCreditLimit(double creditLimit){
		if(creditLimit >= 0){
			this.creditLimit = creditLimit;
		}
	}
	
	public double getCreditLimit(){
		return creditLimit;
	}
	
	
	@Override
	public String toString(){
		 return String.format("Account Number [%d] | APR: %.1f | Credit Limit: %.2f | Current Balance: $%.2f.",
            super.getNumber(), apr, creditLimit, super.getBalance());
	}
	
	@Override
	public void withdraw(double amount){
		if(amount < creditLimit + super.getBalance()){
			super.setBalance(super.getBalance() - amount);
		}
	}
	
	public double calculatePayment(){
		double paymentFormula = (apr / 12) * (- super.getBalance());
		if(super.getBalance() > 0){
			return 0; 
		} else if (paymentFormula <  20){
			return paymentFormula;
		} else {
			return 20;
		}
	}
}
	
public class TestAccounts{
	 public static void main(String[] args) {
		 Account [] accounts = new Account[5];
		 
		 accounts[0] = Account(1066L,7500);
		 accounts[1] = SavingsAccount(30507L,7500, 0.015);
		 accounts[2] = CreditCardAccount(51782737L,7500, 0.08,1000);
		 accounts[3] = CreditCardAccount(629553328L ,1500, 0.075,5000);
		 accounts[4] = CreditCardAccount(4977201043L,-5000, 0.07,10000);
		 
		 accounts[0].deposit(2134);
		 accounts[0].withdraw(2134);
	 }
	
}

