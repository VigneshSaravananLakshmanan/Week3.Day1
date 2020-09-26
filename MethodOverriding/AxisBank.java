package MethodOverriding;

public class AxisBank extends BankInfo {
	
	public int deposit(int amount)
    {
    	int deposit = (amount*7)/100;
    	return deposit;
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Creating the object for the Derived/Child class */
		
		AxisBank axisbank = new AxisBank();
		
		/* This is the method called from parent class */
		axisbank.saving();
		
		/* This is the method called from parent class */
		axisbank.fixed();
		
		/* Though the  method name availabe both in Parent and child, but the method listed in the child class gets executed.
		 * This is termed as Polymorphism -Method Overriding */
		 
		System.out.println("The deposit amount of the bank is"+axisbank.deposit(500));

	}

}
