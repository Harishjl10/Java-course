package com.xworkz.inheretance.example.app;

public class Coffe {
	public String brand;
	public String name;
	
	public Coffe() {
		this("puma");
		System.out.println("running in empty cont");
	}
	public Coffe(String brand) {
		this.brand=brand;
		System.out.println("running in brand in coffe");
		
	}
	public Coffe(String brand,String name) {
		this(brand);
		this.name=name;
		System.out.println("running in brand and name in coffe");
	}
}
