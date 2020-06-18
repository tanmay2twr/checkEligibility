package com.wipro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CreditCardDetails")
public class CreditCardDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	private String PANNumber;

	private double CreditScore;

	public CreditCardDetails() {
		PANNumber = "";
		CreditScore = 0.0;
	}

	public CreditCardDetails(String PANNumber, double d) {
		this.PANNumber = PANNumber;
		this.CreditScore = d;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPANNumber() {
		return PANNumber;
	}

	public void setPANNumber(String pANNumber) {
		PANNumber = pANNumber;
	}

	public double getCreditScore() {
		return CreditScore;
	}

	public void setCreditScore(float creditScore) {
		CreditScore = creditScore;
	}

}
