package com.jlp.designpattern.creational;

/**
 * 总结：和工厂方法模式的区别就是提供了多个产品工厂（产品工厂升级为主题工厂）
 * @author jianglingpingboy@163.com
 *
 */
public class AbstractFactory {

	
	public static void main(String[] args) {
		NewToyotoCarFactory factory =new NewToyotoCarFactory();
		factory.produce().printName();
		factory.banBaoxian().print();

	}

}

interface Baoxian {
	void print();
	static int getI() {
		return 1;
	}
}

interface AbstractCarFactoryInter{
	Car produce();
	Baoxian banBaoxian();
}



class NewToyotoCarFactory implements AbstractCarFactoryInter{
	@Override
	public Car produce() {
		Car c=new Car() {
			@Override
			public void printName() {
				System.out.println("Toyoto");
				
			}
		};
		return c;
	}

	@Override
	public Baoxian banBaoxian() {
		Baoxian baoxian=new Baoxian() {

			@Override
			public void print() {
				System.out.println("PinanBaoxian");
			}
			
		};
		return baoxian;
	}
}