package com.jlp.javareview.base.duotai;

public class Parent {
	private int pVarPrivate;
	public int pVarPublic;
	int pVarDefault;
	protected int pVarProtected;
	protected Parent(){
		System.out.println("Parent()");
	}
	Parent(int xxx){
		
	}
	private static int work123(double worktype){
		
		return 0;
	}
	public static void main(String[] args) {
		boolean b=true;
		b|=false;
		System.out.println(b);
		
	}
}
