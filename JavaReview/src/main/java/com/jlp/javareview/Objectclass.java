package com.jlp.javareview;

public class Objectclass {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Objectclass obj=new Objectclass();
		
		
		try {
			obj=null;
			System.gc();
			Thread.sleep(10000);
			//obj.clone();
			//obj.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize");
	}
}
