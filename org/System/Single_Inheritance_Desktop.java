package org.System;

public class Single_Inheritance_Desktop extends Single_Inheritance_Computer  {
	
	public void desktopSize() {
		
		System.out.println("This method identifies the Desktop size");
	}
	
	/*Declaring the main method*/
	public static void main(String[] args) {
		
		/* Creating the object for the Child class */
		Single_Inheritance_Desktop inherit = new Single_Inheritance_Desktop();
		
		/* Using the object of child class, the method computerModel from parent class is called of
		 * -  One object is used to call the methods of its inherited parent class which saves memory */
		inherit.computerModel();
		
		/* The method of the same class is called */
		inherit.desktopSize();
		
		
		
		
	}
	

}
