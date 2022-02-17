package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer number;
	private Date issueDate;
	private Double totalValue;
	List<Installment> installments = new ArrayList<>();
	
	public Contract() {
	}

	public Contract(Integer number, Date issueDate, Double totalValue) {
		super();
		this.number = number;
		this.issueDate = issueDate;
		this.totalValue = totalValue;
	
	}

	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Double getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}
	
	public void addInstallment(Installment installment) {
		installments.add(installment);
	}
	
	
	
	
}
