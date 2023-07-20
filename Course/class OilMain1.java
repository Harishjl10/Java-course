class OilMain1{
	public static void main(String[] args){
		Oil oil = new Oil();
		
		Oil oil1 = new Oil("Sun flower");
		
		String brand = "Ruchi gold";
		double viscosity = 10;
		Oil oil2 = new Oil(brand, viscosity);
		
		String brandPalm = "Palm Oil";
		double viscosityPalm = 20;
		double price = 200;
		Oil oil3 = new Oil(brand, viscosity, price);
	}
}