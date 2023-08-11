Class Company extends Mall{
 public String name;
 public String ceo;
 public String originCountry;
 
 public Company(String name,String ceo,String originCountry){
	 this.name=name;
	 this.ceo=ceo;
	 this.originCountry=originCountry;
 }
 public void Company(){
	 System.out.println("name of the company:"+this.name);
	 System.out.println("name of the company:"+this.ceo);
	 System.out.println("name of the originCountry:"+this.originCountry);
 }
 
}