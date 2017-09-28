package com.BankAccount;


public class Eligibility {
	private String accountType; //Text input (Numeric innputs only)
	private int initialDeposit; //Text input (Numeric innputs only)
	private String directDeposit; //Yes or No radio
	private String card;	//Dropdown box
	private int loanAmount; //Text input (Numeric innputs only)
	private String creditScore; //Dropdown box
	
	//CREATE GETTERS AND SETTER METHODS FOR EACH VARIABLE
	//Account Type
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	//Initial deposit
	public int getInitialDeposit() {
		return initialDeposit;
	}
	public void setInitialDeposit(int initialDeposit) {
		this.initialDeposit = initialDeposit;
	}
	
	//Direct deposit
	public String getDirectDeposit() {
		return directDeposit;
	}
	public void setDirectDeposit(String directDeposit) {
		this.directDeposit = directDeposit;
	}
	
	//Card
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	
	//Loan amount
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	//Credit score
	public String getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(String creditScore) {
		this.creditScore = creditScore;
	}
	
	
}
