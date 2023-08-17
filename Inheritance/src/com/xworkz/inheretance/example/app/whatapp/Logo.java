package com.xworkz.inheretance.example.app.whatapp;

public class Logo {
	    private String name;
	    private String shape;
	    private String color;
	    private int width;
	    private int height;

	    public Logo(String name, String shape, String color, int width, int height) {
	        this.name = name;
	        this.shape = shape;
	        this.color = color;
	        this.width = width;
	        this.height = height;
	    }
	    public Logo() {
			// TODO Auto-generated constructor stub
		}

	    @Override
	    public String toString() {
	        return "Logo{" +
	                "name='" + name + '\'' +
	                ", shape='" + shape + '\'' +
	                ", color='" + color + '\'' +
	                ", width=" + width +
	                ", height=" + height +
	                '}';
	    }

	    
	}

