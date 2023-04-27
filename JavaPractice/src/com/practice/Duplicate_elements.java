package com.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Duplicate_elements {
	public static void main (String args[]) {
		Scanner scan=new Scanner(System.in);
		LinkedHashSet<Integer> h=new LinkedHashSet<Integer>();
		for(int i=0;i<10;i++) {
			int num=scan.nextInt();
			h.add(num);
		}
		System.out.println(h);
	}
}
