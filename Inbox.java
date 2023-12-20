package com.mail;

import java.util.Scanner;

public class Inbox {
	Email [] emails;
	Scanner sc=new Scanner(System.in);
	
	public Inbox(Email [] emails) {
		this.emails=emails;
	}
	
	public void displayInboxEmails() {
		String stop="No";
		while(!stop.equals("Yes")) {
		System.out.println("***********************   Mails in Inbox    ************************");
		for(int i=0;i<emails.length;i++) {
			System.out.println(emails[i].from);
		}
		System.out.println("*********************************************************");
			System.out.println("Click mail you want to open ");
			String s=sc.next();
			for(int j=0;j<emails.length;j++) {
				if(s.equals( emails[j].from)) {
					emails[j].displayEmailInfo();
					
				}	
			}
			System.out.println("For Stop Gmail type Yes and Go back to Inbox type anything ");
			stop=sc.next();
		}	
	}
}
