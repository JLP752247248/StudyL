package com.jlp.designpattern.creational;

public class BuilderPat {
	
	
	public static void main(String[] args) {
		Computer cp=new Computer.Builder().orgCpu().orgBord().orgKeytab().build();
	}
	
	
	
	
	
}

class Computer{
	private String cpu;
	private String bord;
	private String keytab;

	
	
	private Computer(Builder bd) {
		this.bord=bd.bord;
		this.cpu=bd.cpu;
		this.keytab=bd.keytab;
	}
	
	static class Builder {
		private String cpu;
		private String bord;
		private String keytab;
		public Builder orgCpu() {
			return this;
		}
		public Builder orgBord() {
			return this;
		}
		public Builder orgKeytab() {
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
		public void setCpu(String cpu) {
			this.cpu = cpu;
		}
		public void setBord(String bord) {
			this.bord = bord;
		}
		public void setKeytab(String keytab) {
			this.keytab = keytab;
		}
		
		
	}

	public String getCpu() {
		return cpu;
	}

	

	public String getBord() {
		return bord;
	}

	
	public String getKeytab() {
		return keytab;
	}

	
	
	
}
