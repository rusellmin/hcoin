package com.havas.hchain.blockchain;

public class TxIn {
	private String txOutId;
	private long txOutIndex;
	private String signature;
	public String getTxOutId() {
		return txOutId;
	}
	public void setTxOutId(String txOutId) {
		this.txOutId = txOutId;
	}
	public long getTxOutIndex() {
		return txOutIndex;
	}
	public void setTxOutIndex(long txOutIndex) {
		this.txOutIndex = txOutIndex;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	

}
