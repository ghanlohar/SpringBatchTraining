package com.cts.hc.util;

public class Employee {
	private int claim_id; 
	private String doc;
	private int amount;
	private String policyholder_name;
	
	public int getClaim_id() {
		return claim_id;
	}
	public void setClaim_id(int claim_id) {
		this.claim_id = claim_id;
	}
	public String getDoc() {
		return doc;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getPolicyholder_name() {
		return policyholder_name;
	}
	public void setPolicyholder_name(String policyholder_name) {
		this.policyholder_name = policyholder_name;
	}
}
