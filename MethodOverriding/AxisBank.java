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
		axisbank.saving();
		axisbank.fixed();
		
		/* Though the same method name is availabe in Parent and child, the method listed in the child class gets executed.
		 * This is termed as Polymorphism -Method Overriding */
		 
		System.out.println("The deposit amount of the bank is"+axisbank.deposit(500));

	}

}
