package org.javi;




public class Progream {

	public static void main(String[] args) { 
		String s ="WELCOME TO MY CLASS";
		
		String[] split = s.split("");	
		for (int i = split.length-1; i>0; i--) {
		System.out.print(split[i]+"");
			
			
		
			
			for (int j = s.length()-1; j >0; j--) {
				char charAt = s.charAt(j);
				System.out.print(charAt);
				
			}
			
		}
		
	}
	
	
	
}
