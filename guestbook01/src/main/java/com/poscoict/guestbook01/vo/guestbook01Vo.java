package com.poscoict.guestbook01.vo;

public class guestbook01Vo {

	private int no;
	private String name;
	private String password;
	private String reg_date;
	private String message;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "guestbook01Vo [no=" + no + ", name=" + name + ", password=" + password + ", reg_date=" + reg_date
				+ ", message=" + message + "]";
	}

}
