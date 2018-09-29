package com.sadr.util;

public class Message {
	public static final String FAIL_CODE = "400";
	public static final String FAIL_MESSAGE = "failed";
	public static final String SUCCESS_CODE = "200";
	public static final String SUCCESS_MESSAGE = "success";
	
	private String code;
	private String message;
	private int count;
	private Object data;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Message [code=" + code + ", message=" + message + ", data=" + data + "]";
	}
}
