package com.practice;
import java.io.*;
import java.util.*;

public class PatternPrinting {
	public static void main(String args[]) {
		String n="*";
		Scanner scan=new Scanner(System.in);
		int tyms=scan.nextInt();
		printpattern(n,tyms);
	}
	static String printpattern(String n,int tyms){
		for(int i=0;i<tyms;i++) {
			for(int j=0;j<=i;j++) {
				for(int k=tyms;k>=i;k--) {
					System.out.print(" ");
				}
				System.out.print(""+n);
			}
			System.out.println();
			
		}
		return n;
		
	}

}
