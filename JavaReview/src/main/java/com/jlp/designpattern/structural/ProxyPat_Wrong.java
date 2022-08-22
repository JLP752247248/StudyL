package com.jlp.designpattern.structural;
/**
 * 代理模式
 * @author jianglingpingboy@163.com
 *
 */
public class ProxyPat_Wrong {
	
	public static void main(String[] args) {
		Sell sellor=new Seller();
		Sell apppleSellor=new AppleSeller();
		SellerProxyer proxyer=new SellerProxyer(sellor);
		
		proxyer.sell();
		proxyer.setSeller(apppleSellor);
		proxyer.sell();
	}
}


interface Sell{
	void sell();
}

class Seller implements Sell{
	
	public void sell() {
		System.out.println("selling");
	}
}

class AppleSeller implements Sell{
	
	public void sell() {
		System.out.println("selling apples");
	}
}

class SellerProxyer implements Sell{
	Sell sellor=null;
	SellerProxyer(Sell sellor){
		this.sellor=sellor;
	}
	
	
	//这里是错的，代理模式的目标是隐藏被代理者，限制客户端权限，是个黑盒，所以sellor是预置好的。
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