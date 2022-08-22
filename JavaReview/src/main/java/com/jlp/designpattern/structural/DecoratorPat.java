package com.jlp.designpattern.structural;

/**
 * 装饰器模式
 * 
 * 使用代理模式，代理和真实主题之间的关系通常在编译时设置，而 装饰器模式可以在运行时递归地构造
 * @author jianglingpingboy@163.com
 *
 */
public class DecoratorPat {
	public static void main(String[] args) {
		Sell sellor=new MySellerDecorator(new MySellerDecorator1(new SimpleSeller()));
		sellor.sell();
	}
}




class SimpleSeller implements Sell{
	
	public void sell() {
		System.out.println("selling");
	}
}

abstract class SellerDecorator implements Sell{
	Sell sellor=null;
	SellerDecorator(Sell sellor){
		this.sellor=sellor;
	}
	
	public void setSeller(Sell sellor) {
		this.sellor=sellor;
	}
	
	@Override
	public void sell() {
		sellor.sell();
	}
	
	
	
}


class MySellerDecorator extends SellerDecorator{

	MySellerDecorator(Sell sellor) {
		super(sellor);
	}
	
	public void setSeller(Sell sellor) {
		this.sellor=sellor;
	}
	
	@Override
	public void sell() {
		before();
		sellor.sell();
		after();
	}
	
	
	public void before() {
		System.out.println("bargain议价");
	}
	
	public void after() {
		System.out.println("Bookkeeping记账");
	}
	
}

class MySellerDecorator1 extends SellerDecorator{

	MySellerDecorator1(Sell sellor) {
		super(sellor);
	}
	
	public void setSeller(Sell sellor) {
		this.sellor=sellor;
	}
	
	@Override
	public void sell() {
		before1();
		sellor.sell();
		after2();
	}
	
	
	public void before1() {
		System.out.println("狠狠bargain议价");
	}
	
	public void after2() {
		System.out.println("狠狠Bookkeeping记账");
	}
	
}


