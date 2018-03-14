package com.havas.hchain.blockchain;

import java.util.ArrayList;

public class Transaction {
	private String id;
	private ArrayList<TxIn> txIns;
	private ArrayList<TxOut> txOuts;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<TxIn> getTxIns() {
		return txIns;
	}
	public void setTxIns(ArrayList<TxIn> txIns) {
		this.txIns = txIns;
	}
	public ArrayList<TxOut> getTxOuts() {
		return txOuts;
	}
	public void setTxOuts(ArrayList<TxOut> txOuts) {
		this.txOuts = txOuts;
	}
	
	static public String getTransactionId(Transaction transaction) {
		String txInContent = "";
		String txOutContent = "";
		for(TxIn txIn : transaction.getTxIns()) {
			txInContent += txIn.getTxOutId() + txIn.getTxOutIndex(); 
		}
		for(TxOut txOut : transaction.getTxOuts()) {
			txOutContent += txOut.getAddress() + txOut.getAmount();
		}		
		return Crypto.getSha256Hex(txInContent + txOutContent, "UTF-8");
	}

}
