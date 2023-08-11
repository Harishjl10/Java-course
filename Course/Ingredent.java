class Ingredent{
	public String name;
	public String quality;
	public int cost;
	
	public Ingredent(String name,String quality,int cost){
		this.name=name;
		this.quality=quality;
		this.cost=cost;
		
	}
	public void Ingredent(){
		System.out.println("Ingredent name:"+this.name);
		System.out.println("Ingredent quality:"+this.quality);
		System.out.println("Ingredent cost:"+this.cost);
		

		
	}
	public static void main(String[] args){
		System.out.println("invoking in main method");
		Ingredent ingredent=new Ingredent("harish","good",500);
        System.out.println(ingredent(i));		
	}
}