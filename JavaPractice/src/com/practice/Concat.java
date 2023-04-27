package com.practice;

import java.util.Scanner;

public class Concat {
	
	String str2="",d="";
	public String vowels(String str) {
		for(int i=0;i<str.length();i++){
			char vow=str.charAt(i);
			if(vow=='a'||vow=='A'||vow=='e'||vow=='E'||vow=='i'||vow=='I'||vow=='o'||vow=='O'||vow=='u'
					||vow=='U'){
				str2=str2+vow;
			}
		}
		return str2;
	}
	
	public String digits(long digit) {
		for(int i=0;i<12;i++) {
			long r=digit%10;
			digit/=10;
			if(r==1||r==2||r==3||r==5||r==7) {
				d=r+d;
				
			}
		}
		return d;
	}

	public static void main(String args[]) {
		
		Concat c=new Concat();
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		long digit=sc.nextLong();
		String str3=c.vowels(str);
		String str4=c.digits(digit);
		System.out.println(str3.concat(str4));
		
	}
}
