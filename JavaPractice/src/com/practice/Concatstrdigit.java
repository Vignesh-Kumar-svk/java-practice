package com.practice;

import java.util.Scanner;

public class Concatstrdigit {
	String str2="",d="";
	public String vowelsdigit(String str,long digit) {
		
		for(int i=0;i<str.length();i++){
			char vow=str.charAt(i);
			for(int j=0;j<12;j++) {
				long r=digit%10;
				digit/=10;
				if(r==2||r==3||r==5||r==7) {
						if(vow=='a'||vow=='A'||vow=='e'||vow=='E'||vow=='i'||vow=='I'||vow=='o'||vow=='O'||vow=='u'
								||vow=='U') {
							d=d+r;
							str2=d+vow;
						}
				}
			}
			
		}
		return str2;
		
		
	}

	public static void main(String args[]) {
		
		Concatstrdigit c=new Concatstrdigit();
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		long digit=sc.nextLong();
		String str3=c.vowelsdigit(str,digit);
		
		System.out.println(str3);
		
	}

}
