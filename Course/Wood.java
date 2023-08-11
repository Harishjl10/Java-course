class Wood extends Mall{
	String color;
	String name;
	int size;
	String cracking;
	String shape;
	
	Wood(){
		System.out.println("running main in wood");
	}
	Wood(String color,String name){
		System.out.println("running main in wood");
		this.color=color;
		this.name=name;

	}
	Wood(String color,String name,int size){
		//this.color=color;
		//this.name=name;
		this(color,name);
		System.out.println("running main in color name and size ");
		this.size=size;
	}
    Wood(String color,String name,int size,String cracking){
		//this.color=color;
		//this.name=name;
		//this.size=size;
		this(color,name,size);
		System.out.println("running main in color name and size ");

		this.cracking=cracking;
	}	
    Wood(String color,String name,int size,String cracking,String shape){
		this(color,name,size,cracking);
		System.out.println("running main in color name and size ");
		this.shape=shape;
	}		
	
	
}