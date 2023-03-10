package models.entities;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
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

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit (Double value) {
		balance += value;
	}
	
	public void withdraw (Double value) throws DomainException{
		validate(value);
		balance -= value;
	}

	public void validate (Double value) throws DomainException {
		if (value > balance) {
			throw new DomainException("Valor de saque excedido!");
		}
		if (value > withdrawLimit) {
			throw new DomainException("Valor de saque excedeu o limite!");
		}
	}
}
