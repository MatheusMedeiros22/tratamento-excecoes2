package entities;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private	Double withdraLimit;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance, Double withdraLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdraLimit = withdraLimit;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) throws EntitiesException {
		if(balance < amount) {
			throw new EntitiesException("Saldo insuficiente, você têm R$" + getBalance());
		}
		if(amount >= withdraLimit) {
			throw new EntitiesException("Excedeu o limite de saque, limite disponível para hoje é -> R$" + getWithdraLimit());
		}
		balance -= amount;
		withdraLimit -= amount;
	}
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdraLimit() {
		return withdraLimit;
	}

	public void setWithdraLimit(Double withdraLimit) {
		this.withdraLimit = withdraLimit;
	}
	
	
}
