package com.practice;

import java.util.*;
public class CountVowels {
	int count=0;
	public int vowels(String str) {
		
		for(int i=0;i<str.length();i++){
			char vow=str.charAt(i);
			if(vow=='a'||vow=='A'||vow=='e'||vow=='E'||vow=='i'||vow=='I'||vow=='o'||vow=='O'||vow=='u'
					||vow=='U'){
				count++;
			}
		}
		return count;
		
	}
	public static void main(String args[]) {
		CountVowels c=new CountVowels();
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println(c.vowels(str));
		scan.close();
	}
	

}
