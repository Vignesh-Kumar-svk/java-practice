package com.practice;

import java.util.*;

public class Main {

	static String str2="";
	static String res=" ";
	static int j=0;
	public  static String SearchChallenge(String str,int num) {
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' '||ch=='.'||ch==',') {
				str2=str2+ch;
				continue;
			}
			else
			{
				char changedstring=ch+=num;
				str2=str2+changedstring;
			}
		}
		System.out.println(str2);
		String token="LXquyihFmjiUopwe";
		for( int k=0;k<token.length();k++) {
			char tokench=token.charAt(k);
			if(k==0) {
				res=res+tokench;
			}
			else if((k%num)==0) {
				while(j<(2*str.length())) {
					char retoken=str2.charAt(j);
					res=res+tokench+retoken;
					j++;
					break;
					
			}
		  }
			else {
				res=res+tokench;
			}
		}
				
		return res;
		}
	
	
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int num=scan.nextInt();
		System.out.print(SearchChallenge(str, num));
	}
}
