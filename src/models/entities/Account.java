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
	
	public void withdraw (Double value) {
		balance -= value;
	}

	public String validate (Double value) {
		if (value > balance) {
			return "Valor de saque excedido!";
		}
		if (value > withdrawLimit) {
			return "Valor de saque excedeu o limite!";
		}
		return null;
	}
}
