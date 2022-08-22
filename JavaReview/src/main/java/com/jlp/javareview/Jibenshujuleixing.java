package com.jlp.javareview;

import java.math.BigDecimal;

public class Jibenshujuleixing {
public static void main(String[] args) {
	byte bt=100;
	short st=bt;
	char c=98;
	//c=bt;Type mismatch: cannot convert from byte to char
	int i=st;
	i=c;
	i=bt;
	long l=10000000000l;
	l=i;
	
	//i=l;Type mismatch: cannot convert from byte to char
	float f=999999999.88f;
	f=l;
	
	double d=399.999d;
	d=l;
	
	
	byte bt2=bt;
	
	Integer integer=i;
	i=integer;
	//integer=bt;
	integer=new Integer(bt);
	integer=(int)bt;
	integer=(int)l;
	
	i=new Short("12");
	
	
	Integer integer100=100;
	Integer integer100A=100;
	System.out.println(integer100.hashCode());
	System.out.println(integer100A.hashCode());
	System.out.println(integer100==integer100A);
	integer100=new Integer(100);
	integer100A=new Integer(100);
	System.out.println(integer100.hashCode());
	System.out.println(integer100A.hashCode());
	System.out.println(integer100==integer100A);

	double b1=40.1d;
	double b3=33.2d;
	double b4=34.4d;
	
	double mid=b3;
	double res=b4-mid;
	System.out.println(res>=1.2D); 
	System.out.println(b4-mid); 
	
	
	BigDecimal f1=new BigDecimal(40.1);
	BigDecimal f3=new BigDecimal(33.4);
	BigDecimal f4=new BigDecimal(34.6);
	
	System.out.println(ret());

	if(f4.subtract(f3).floatValue()==1.2f) {
		System.out.println("yyyy");
	}else {
		System.out.println("xxxx");
	}

	
	
	
}
	public static boolean ret() {
		boolean res;
		try {
			
		}catch(Exception e) {
			return true;
		}finally {
			
		}
		
		
		return true;
		
	}
}
