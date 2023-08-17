package com.xworkz.inheretance.example.app.whatapp;

public class Pandant {
	private String material;
    private String color;
    private double weight;
    private String gemstone;
    private int chainLength;
    private boolean isPrecious;
    private boolean isEngraved;
    private boolean isHollow;
    private int numDiamonds;
    private boolean isAntique;
    private String design;
    private String symbol;
	public Pandant(String material, String color, double weight, String gemstone, int chainLength, boolean isPrecious,
			boolean isEngraved, boolean isHollow, int numDiamonds, boolean isAntique, String design, String symbol) {
		super();
		this.material = material;
		this.color = color;
		this.weight = weight;
		this.gemstone = gemstone;
		this.chainLength = chainLength;
		this.isPrecious = isPrecious;
		this.isEngraved = isEngraved;
		this.isHollow = isHollow;
		this.numDiamonds = numDiamonds;
		this.isAntique = isAntique;
		this.design = design;
		this.symbol = symbol;
	}
    
    @Override
    public String toString() {
    	return super.toString();
    }
}
