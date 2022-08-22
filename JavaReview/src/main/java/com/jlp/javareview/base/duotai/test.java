package com.jlp.javareview.base.duotai;

public class test {
	public static void main(String[] args) {
		Son s=new Son();
		int d=s.pVarDefault;
		int d1=s.pVarProtected;
		int d2=s.pVarPublic;
		int d3=s.sonVarPub;
		Parent p=new Son();
		int x=p.pVarDefault;
		int x1=p.pVarProtected;
		int x2=p.pVarPublic;
		//int x3=p.sonVarPub;
	

	}
	
}
