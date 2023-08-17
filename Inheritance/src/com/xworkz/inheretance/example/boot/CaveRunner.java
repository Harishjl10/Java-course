package com.xworkz.inheretance.example.boot;

import com.xworkz.inheretance.example.app.whatapp.Cave;

public class CaveRunner {
	    public static void main(String[] args) {
	    	Cave ref = new Cave();
	        Cave cave = new Cave("Crystal Cavern", 100.0, 50.0, 30.0, 5,
	                true, true, 200, "Calcite", true);
	        System.out.println(ref);
	        System.out.println(cave);
	    }

}
