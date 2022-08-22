package com.jlp.javareview.base.duotai;

public class Son extends Parent{
	Son() {
		super(89);
	}
	Son(int xxx) {
		this();
	}

	private int sonVar;
	public int sonVarPub;
	public int work(double j){
		System.out.println(this);
		return 9;
	}
	
	public static void main(String[] args) {
		
		Integer it=new Integer(9);
		System.out.println(it.hashCode());
		it=89;
		System.out.println(it.hashCode());
		System.out.println(0.2 + 0.1);
        System.out.println(0.3 - 0.1);
        System.out.println(0.2 * 0.1);
        System.out.println(0.3 / 0.1);
	
	}
}
