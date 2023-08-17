package com.xworkz.inheretance.example.app.whatapp;

public class Cave {
	    private String name;
	    private double length;
	    private double width;
	    private double height;
	    private int numberOfRooms;
	    private boolean hasWaterSource;
	    private boolean isExplored;
	    private int stalactiteCount;
	    private String mainMineral;
	    private boolean hasBats;

	    // Constructor
	    public Cave(String name, double length, double width, double height, int numberOfRooms,
	                boolean hasWaterSource, boolean isExplored, int stalactiteCount,
	                String mainMineral, boolean hasBats) {
	        this.name = name;
	        this.length = length;
	        this.width = width;
	        this.height = height;
	        this.numberOfRooms = numberOfRooms;
	        this.hasWaterSource = hasWaterSource;
	        this.isExplored = isExplored;
	        this.stalactiteCount = stalactiteCount;
	        this.mainMineral = mainMineral;
	        this.hasBats = hasBats;
	    }
	    public Cave() {
			// TODO Auto-generated constructor stub
		}

	    @Override
	    public String toString() {
	        return "Cave{" +
	                "name='" + name + '\'' +
	                ", length=" + length +
	                ", width=" + width +
	                ", height=" + height +
	                ", numberOfRooms=" + numberOfRooms +
	                ", hasWaterSource=" + hasWaterSource +
	                ", isExplored=" + isExplored +
	                ", stalactiteCount=" + stalactiteCount +
	                ", mainMineral='" + mainMineral + '\'' +
	                ", hasBats=" + hasBats +
	                '}';
	    }
	}
