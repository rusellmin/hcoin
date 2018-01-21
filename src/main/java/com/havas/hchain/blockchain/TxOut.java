package com.havas.hchain.blockchain;

public class TxOut {
	private String address;
	private long amount;
	public TxOut(String address, long amount) {
		this.address = address;
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	

}
