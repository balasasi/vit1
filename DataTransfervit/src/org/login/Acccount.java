package org.login;

public class Acccount {
private String accName;
private Double balance;
public String getAccName() {
	return accName;
}
public void setAccName(String accName) {
	this.accName = accName;
}
public Double getBalance() {
	return balance;
}
public void setBalance(Double balance) {
	this.balance = balance;
}



public void display(Acccount a3) {
	
System.out.println(a3.getAccName());
System.out.println(a3.getBalance());
Acccount a4=a3;
a4.setAccName("Pqr");
a3.setBalance(3000.00);
System.out.println(a3.getAccName());
}
public static void main(String[] args) {
	Acccount  a1 = new Acccount ();
	a1.setAccName("xyz");
	a1.setBalance(1000.00);
	Acccount  a2 = new Acccount ();
	a2.setAccName("abc");
	a2.setBalance(2000.00);
a1.display(a2);
System.out.println(a1.getBalance());













}



}
