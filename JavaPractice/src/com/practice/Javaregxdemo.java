package com.practice;
import java.util.Scanner;
import java.util.regex.*;
public class Javaregxdemo {
	public static void main(String args[]) {
		
		System.out.println("? quantifier ....");
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine();
		//String str2=scan.nextLine();
		
		//System.out.println(Pattern.matches(str1, str2));
		
		Pattern pattern=Pattern.compile("[aeiou]");
		Matcher matcher=pattern.matcher(str1);
		if(matcher.find()) {
			System.out.println(str1);
		}
		else {
			System.out.println("not found");
		}
		
	}
}
