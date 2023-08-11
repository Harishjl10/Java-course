class Static{
	String name;
	
	// A Static method can accesed without creating object in first class
		static void harish(){
			System.out.println("invoking main in static");
		}
		public void harishjl(String name){
			System.out.println("invoking main in harish: "+name);

		}
		
		//this is the main method
		public static void main(String[] args){
			
		harish();
		//harishjl("gagan");
		//System.object.println(harishjl.name);
		
		Static myhari= new Static();
		myhari.harishjl("gagan");
		
		}
}