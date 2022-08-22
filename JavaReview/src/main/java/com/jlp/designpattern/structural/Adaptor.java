package com.jlp.designpattern.structural;
/**
 * 适配器模式
 * @author jianglingpingboy@163.com
 *
 */
public class Adaptor {

	
	
	public static void main(String[] args) {
		Socketer3  socket3=new Socketer3();
		Plug3 p3=new Plug3W();
		Plug2 p2=new Plug2W();
		socket3.socket(p3);
		//socket3.socket(p2);
		socket3.socket(new Plugin2T3Adaptor(p2));
	}

	
}
interface Plug2{
	void work2();
}

interface Plug3{
	void work3();
}

class Plug2W implements Plug2{
	@Override
	public void work2() {
		System.out.println("Plug2W");
	}
}
class Plug3W implements Plug3{
	@Override
	public void work3() {
		System.out.println("Plug3W");
	}
}


interface Socket2{
	void socket(Plug2 p);
}
interface Socket3{
	void socket(Plug3 p);
}

class Socketer3 implements Socket3{

	@Override
	public void socket(Plug3 p) {
		p.work3();
	}
	
}
class Plugin2T3Adaptor implements Plug3{
	Plug2 s2;
	Plugin2T3Adaptor(Plug2 s2){
		this.s2=s2;
	}
	@Override
	public void work3() {
		System.out.println("p2->p3");
		s2.work2();
	}
}

