class Mall{
	String name;
	String shape;
	int space;
	int floor;
	String brand;
	String employe;
	
	Mall(){
		System.out.println("running main in Mall");
		
	}
	Mall(String name,String shape){
		System.out.println("running main in name and shape");
		this.name=name;
		this.shape=shape;
		
	}
	Mall(String name,String shape,int space){
		this(name,shape);
		System.out.println("running main in name and shape space");
		this.space=space;
		
		
	}
	Mall(String name,String shape,int space,int floor){
		this(name,shape,space);
		System.out.println("running main in name and shape space");
		this.floor=floor;
		
		
		
	}
	Mall(String name,String shape,int space,int floor,String brand){
		this(name,shape,space,floor);
		System.out.println("running main in name and shape space brand");
		this.brand=brand;	
	}
	Mall(String name,String shape,int space,int floor,String brand,String employe){
		this(name,shape,space,floor,brand);
		System.out.println("running main in name and shape space brand");
		this.employe=employe;	
	}
}