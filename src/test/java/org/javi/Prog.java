package org.javi;

public class Prog {

	
	public static void main(String[] args) {
		int n=3;
		for (int i = 1; i <= n; i++) {
			
			for (int s = n; s > i; s--) {
				System.out.println("  ");
				for (int j = 1; j <=i; j++) {
					System.out.print( "*");
				}
				System.out.println( );
			}
		}
		
		
		
	}
	
	
	
}
