package Sdet_Java;

public class Daythree_AssignmentConstructor2 {
	
	public Daythree_AssignmentConstructor2() {
		System.out.println("Default parameterized constructor");
	}
	
	public Daythree_AssignmentConstructor2(int a) {
		this();
		System.out.println("One parameterized constructor" );
	}
	
	public Daythree_AssignmentConstructor2(int a,int b) {
		System.out.println("two parameterized constructor" );
	}
	
	public Daythree_AssignmentConstructor2(int a,int b,int c) {
		System.out.println("three parameterized constructor" );
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Daythree_AssignmentConstructor2 dtac = new Daythree_AssignmentConstructor2(1,3,4);
		Daythree_AssignmentConstructor2 dtac1 = new Daythree_AssignmentConstructor2(1);
		Daythree_AssignmentConstructor2 dtac12 = new Daythree_AssignmentConstructor2(1,4);

	}

}
