package com.havas.hchain.blockchain;

public class UnspentTxOut {
	private String txOutId;	
	private long txOutIndex;
	private String address;
	private long amount;
	
	public UnspentTxOut(String txOutId, long txOutIndex, String address, long amount) {
		this.txOutId = txOutId;
		this.txOutIndex = txOutIndex;
		this.address = address;
		this.amount = amount;
	}
	
	public String getTxOutId() {
		return txOutId;
	}
	public long getTxOutIndex() {
		return txOutIndex;
	}
	public String getAddress() {
		return address;
	}
	public long getAmount() {
		return amount;
	}

}
