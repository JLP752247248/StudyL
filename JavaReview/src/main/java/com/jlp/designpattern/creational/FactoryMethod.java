package com.jlp.designpattern.creational;

public class FactoryMethod {

	public static void main(String[] args) {
		class MyCarFactory implements CarFactoryInter{
			@Override
			public Car produce() {
				Car c=new Car() {
					@Override
					public void printName() {
						System.out.println("Bentian");
					}
				};
				return c;
			}
		}
		
		MyCarFactory factory=new MyCarFactory();
		factory.produce().printName();
		ToyotoCarFactory toyotoFactory=new ToyotoCarFactory();
		toyotoFactory.produce().printName();
	}

}

interface CarFactoryInter{
	Car produce();
}

class ToyotoCarFactory implements CarFactoryInter{
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
}

