package com.practice;

import java.util.Scanner;

public class Reverseword {
	String rev="";
	public String reverse(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		return rev;
	}
	
	public static void main(String args[]) {
		Reverseword r=new Reverseword();
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println(r.reverse(str));
		scan.close();
	}

}
