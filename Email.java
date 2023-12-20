package com.mail;

public class Email {

	String to;
	String from;
	String subject;
	String body;
	public Email(String to, String from, String subject, String body) {
		this.to = to;
		this.from = from;
		this.subject = subject;
		this.body = body;
	}
	
	public void displayEmailInfo() {
		System.out.println("*************** Information inside "+from+"'"+"Email ***************");
		System.out.println("Mail to : "+to);
		System.out.println("Mail from : "+from);
		System.out.println("Subject : "+subject);
		System.out.println("Body : "+body);
		System.out.println("************************************************************");
	}
	
	
}
