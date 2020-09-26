package MethodOverriding;

public class BankInfo {
	
	/* Creating methods in Parent class - saving(),fixed(),deposit(). */
	
	public void saving() {
		
		System.out.println("This is the Saving method listed in Parent class");

	}
	
    public void fixed() {
		
		System.out.println("This lists all the Fixed accounts active in Parent class");

	}
    
    public int deposit(int amount)
    {
    	int deposit = (amount*5)/100;
    	return deposit;
    	
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
