package com.jlp.designpattern.creational;

/**
 * 单例模式
 * @author jianglingpingboy@163.com
 *
 */
public class SingleTon {
	
	
	public static void main(String[] args) {
		OnlyFactory instance=OnlyFactory.getInstance();
		OnlyFactory instance1=OnlyFactory.getInstance();
		
		System.out.println(instance==instance1);
	}
}
class OnlyFactory{
	private static OnlyFactory instance;
	private OnlyFactory() {
		
	}
	public static OnlyFactory getInstance() {
		synchronized (OnlyFactory.class) {
			if(null==instance) {
				instance=new OnlyFactory();
			}
			return instance;
		}
	}
}