package com.sadr.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

public class Md5Encode {
	private static final String STR = "SADR2018";
	
	public static String md5Encode(String inStr){  
		inStr += STR;
		MessageDigest md5 = null;  
		try{  
			md5 = MessageDigest.getInstance("MD5");  
		}catch(Exception e){  
			System.out.println(e.toString());  
			e.printStackTrace();  
			return "";  
		}  
		byte[] byteArray = null;  
		try {  
			byteArray = inStr.getBytes("UTF-8");  
		} catch (UnsupportedEncodingException e) {  
			e.printStackTrace();  
		}  
		byte[] md5Bytes = md5.digest(byteArray);  
		StringBuffer hexValue = new StringBuffer();  
		for(int i=0;i<md5Bytes.length;i++){  
			int val = md5Bytes[i] & 0xff;  
			if(val<16){  
				hexValue.append("0");  
			}  
			hexValue.append(Integer.toHexString(val));  
		}  
		return hexValue.toString();  
	}  

	public static void main(String[] args) {
		String hashedPassword = Md5Encode.md5Encode("123");
		System.out.println(hashedPassword);
	}	
}
