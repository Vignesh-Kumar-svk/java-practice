package com.practice;

public class AnonymousObjectDemo {
	AnonymousObjectDemo(int a,int b, int c){
		int len=a;
		int bre=b;
		int hei=c;
		System.out.println(len+""+bre+""+hei);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len=0,bre=0,hei=0;
		
		new AnonymousObjectDemo(3,4,5);
		
	}

}
