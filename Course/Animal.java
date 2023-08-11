class Animal{
	//superclass
	public String name;
	
	public Animal(String name){
		this.name=name;
		
	}
	public void makeSound(){
		System.out.println("animal make a sound");
		
	}
	//subclass 
class Dog extends Animal{
	public Dog(String name){
		super(name);
	public void makeSound(){
		System.out.println("dog make sound");
		
	}
	public void walk(){
		System.out.println("walk");

	}
	
	}
}
	public static void main(string[] aargs){
		System.out.println("invokng in main method");
		Animal dog=new Animal();
		System.out.println("name of the dog:"+dog.name);
		dog.makeSound();
		dog.walk();
	}
}