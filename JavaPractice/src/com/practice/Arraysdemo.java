package com.practice;

import java.util.*;

public class Arraysdemo {
public static void main(String args[]) {
	ArrayList a=new ArrayList();
	Scanner scan=new Scanner(System.in);
	for(int i=0;i<10;i++) {
		int num=scan.nextInt();
		a.add(num);
	}
	
	System.out.print(a.get(7));
}

	
}
