package com.mail;

public class TestGmail {
	public static void main(String[] args) {
		
		Email e1=new Email("Nikita","Manasi","want book","can you please give me book");
		Email e2=new Email("Prachi","Pooja","I want notebook","can you please give me notebook");
		Email e3=new Email("Riya","Sayali","I want java notebook","can you please give me Java notebook");
		Email e4=new Email("Neha","Priya","I want SQL notebook","can you please give me Sql notebook");
		Email[] email= {e1,e2,e3,e4};
		Gmail g=new Gmail(new Inbox(email));
		g.openGmail();
		
	}
}
