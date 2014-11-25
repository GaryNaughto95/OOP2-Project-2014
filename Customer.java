// An instantiable class which the customers

import java.io.*;

public class Customer implements Serializable{
	
	private int AccNo;	
	private String name;
	private String Address;
	private int MobileNumber;
	private int Balance;
	
	//accessor method that allow us to aceess the customer details
	
	public int getAccNo() {return AccNo;}
	public String getName() { return name;}
	public String getAddress() {return Address;}
	public int getMobileNumber() {return MobileNumber;}
	public int getBalance() {return Balance;}
	
	//mutator methods to change the value of an attribute
	
	public void setAccNo( int AccNo) {
		
		this.AccNo = AccNo;
		
	}
	
	public void setName( String name) {
		
		this.name = name;
			
	}
	
	public void setAddress( String Address) {
		
		this.Address = Address;
			
	}

	public void setMobileNumber( int MobileNumber){
		
		this.MobileNumber = MobileNumber;
		
	}
	
	public void setBalance( int Balance){
		
		this.Balance = Balance;
		
	}

	// full-args constructor
	
	public Customer(int AccNo, String name, String Address, int MobileNumber, int Balance) {
				
				setAccNo(AccNo);
				setName(name);
				setAddress(Address);
				setMobileNumber(MobileNumber);
				setBalance(Balance);
				
	}	
}