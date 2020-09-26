package MethodOverloading;

public class StudentInfo {
	
	public void getStudentInfo(int id) {
		
		System.out.println("The Identity Number of the Student is"+id);
		
		
	}
	

	public void getStudentInfo(int id, String name) {
		
		System.out.println("The ID and name of the Student is"+id+" "+"and"+" "+name);
		
		
	}
	
    public void getStudentInfo(String name,int id) {
		
		System.out.println("The ID and name of the Student is"+""+id+" "+"and"+" "+name);
		
		
	}
	
    public void getStudentInfo(String email ,long phoneNumber) {
		
		System.out.println("The email and phoneNumber of the Student is"+" "+email+" "+"and"+" "+phoneNumber);
		
		
	}
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Create an object for the Class */
		StudentInfo stud = new StudentInfo();
		stud.getStudentInfo(123456);
		stud.getStudentInfo("Hari",789456);
		stud.getStudentInfo(789456,"Hari");
		stud.getStudentInfo("test@xyz.com",987654321L);
	

	}

}
