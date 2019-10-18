package org.cts;

public class Company {
	private String cname;
	private String caddress;
	public Company(){
		
	}
	public Company(String cname, String caddress) {
		super();
		this.cname = cname;
		this.caddress = caddress;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	
}
