package javaNumberPrograms;

public class Recursion {
	
	//simple factorial
//	int factorial(int n) {
//		int fact=1;
//		while(n>0) {
//			fact *= n;
//			n--;
//		}
//		return fact;
//	}
	
	//recursion

	int rec(int n)
	{
		if(n<=1) return 1;
		else return n*rec(n-1);
			
	}
	
	public static void main(String[] args) {
		Recursion rec = new Recursion();
		
//		System.out.println(rec.factorial(5));
		System.out.println(rec.rec(5));
	}

}
