package entities;

public class Financing {
	
	private Double totalAmount;
	private Double income;
	private Integer months;
	
	public Financing() {
		
	}

	public Financing(Double totalAmount, Double income, Integer months) {
		checkPaymentCapacity(totalAmount, income, months);
		this.totalAmount = totalAmount;
		this.income = income;
		this.months = months;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		checkPaymentCapacity(totalAmount, income, months);
		this.totalAmount = totalAmount;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		checkPaymentCapacity(totalAmount, income, months);
		this.income = income;
	}

	public Integer getMonths() {
		checkPaymentCapacity(totalAmount, income, months);
		return months;
	}

	public void setMonths(Integer months) {
		this.months = months;
	}

	public Double entry() {
		return totalAmount * 0.2;
	}
	
	public Double quota() {
		return (totalAmount - entry()) / months;
	}
	
	public void checkPaymentCapacity(Double totalAmount, Double income, Integer months) {
		if (totalAmount * 0.8 / months > income/2){
			throw new IllegalArgumentException("A parcela é maior que metade da renda. Tente um prazo de financimanto maior.");
		}
	}



}

