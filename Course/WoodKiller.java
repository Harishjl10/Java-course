class WoodKiller{
	public static void main(String[] args){
		System.out.println("Invoking main in WoodKiller");
		Wood wood = new Wood("blue","teak",10,"Thermal","Vector");
		System.out.println(wood.color);
		System.out.println(wood.name);
		System.out.println(wood.size);
		System.out.println(wood.cracking);
		System.out.println(wood.shape);
		wood.Mall("harish");
	}
}