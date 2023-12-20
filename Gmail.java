package com.mail;

public class Gmail {
	Inbox inbox;
	public Gmail(Inbox inbox) {
		this.inbox=inbox;
	}
	public void openGmail() {
		System.out.println("***********************  Gmail Application  *********************** ");
		inbox.displayInboxEmails();
	}
}
