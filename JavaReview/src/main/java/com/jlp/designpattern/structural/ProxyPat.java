package com.jlp.designpattern.structural;
/**
 * 代理模式
 * @author jianglingpingboy@163.com
 *
 */
public class ProxyPat {
	
	public static void main(String[] args) {
		SellerProxyerT proxyer=new SellerProxyerT();
		proxyer.sell();
	}
}


class AppSeller implements Sell{
	
	public void sell() {
		System.out.println("selling app");
	}
}

class SellerProxyerT implements Sell{
	Sell sellor=null;
	SellerProxyerT(){
		this.sellor=new AppSeller();
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