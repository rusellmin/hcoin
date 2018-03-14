package com.havas.hchain.blockchain;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class Crypto {
	static public String getSha256Hex(String text, String encoding){
	    String shaHex = "";
	    try {
	        MessageDigest md = MessageDigest.getInstance("SHA-256");

	        md.update(text.getBytes(encoding));
	        byte[] digest = md.digest();

	        shaHex = DatatypeConverter.printHexBinary(digest);
	    } catch (NoSuchAlgorithmException ex) {
	        //Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
	    } catch (UnsupportedEncodingException ex) {
	    	
	    }
	    return shaHex;
	}

}
