package customer;

public class Customer {
	
	int customerID;
	String name;
	double balance;
	String password;
	long accountID;
	
	public Customer(int customerID,String name,double balance,String password,long accountID){
		this.customerID = customerID;
		this.name = name;
		this.balance = balance;
		this.password = password;
		this.accountID = accountID;
	}
}
